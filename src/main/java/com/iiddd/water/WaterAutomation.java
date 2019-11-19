package com.iiddd.water;

import com.pi4j.io.gpio.*;
import com.pi4j.io.i2c.I2CBus;
import com.pi4j.io.i2c.I2CDevice;
import com.pi4j.io.i2c.I2CFactory;
import org.junit.Assert;

import java.io.IOException;
import java.util.logging.Logger;

public class WaterAutomation {

    private static final String WATER_SENSOR_SMALL_NAME = "Water sensor #1";
    private static final String WATER_SENSOR_MEDIUM_NAME = "Water sensor #2";
    private static final String WATER_SENSOR_LARGE_NAME = "Water sensor #3";
    private static final String WATER_PUMP_NAME = "Water Pump";
    private static final String VALVE_A_NAME = "Valve A";
    private static final String VALVE_B_NAME = "Valve B";
    private static GpioPinDigitalOutput pump;
    private static GpioPinDigitalInput waterSensorSmall;
    private static GpioPinDigitalInput waterSensorMedium;
    private static GpioPinDigitalInput waterSensorBig;
    private static GpioPinDigitalOutput valveA;
    private static GpioPinDigitalOutput valveB;
    private static final GpioController gpio = GpioFactory.getInstance();
    private static final int SENSOR_ADDR = 0x48;

    public static void main(String args[]) throws InterruptedException {
        // provision digital Input
        waterSensorSmall = gpio.provisionDigitalInputPin(RaspiPin.GPIO_07, WATER_SENSOR_SMALL_NAME);
        waterSensorMedium = gpio.provisionDigitalInputPin(RaspiPin.GPIO_16, WATER_SENSOR_MEDIUM_NAME);
        waterSensorBig = gpio.provisionDigitalInputPin(RaspiPin.GPIO_09, WATER_SENSOR_LARGE_NAME);
        pump = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_15, WATER_PUMP_NAME, PinState.HIGH);
        valveA = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_04, VALVE_A_NAME, PinState.HIGH);
        valveB = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_05, VALVE_B_NAME, PinState.HIGH);

        readSensorAnalogData(1);

//        try {
//            device.write();
//        } catch (I2CFactory.UnsupportedBusNumberException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        while (true) {
//            disablePump();
//            if (readWaterSensorSmall().isLow()) {
//                pumpOn(2);
//            }
//            if (readWaterSensorMedium().isLow()) {
//                openValveA();
//                pumpOn(5);
//                closeValveA();
//            }
//            if (readWaterSensorBig().isLow()) {
//                openValveB();
//                pumpOn(7);
//                closeValveB();
//            }
//            Thread.sleep(3600);
//        }
    }

    private static int readSensorAnalogData(int sensorId) {
        int result = 0;
        try {
            I2CBus i2c = I2CFactory.getInstance(I2CBus.BUS_1);
            I2CDevice device = i2c.getDevice(SENSOR_ADDR);
            device.write((byte) (0x48 | (sensorId & 3)));
            result = device.read();
//            buffer = (byte) device.read();
//            unsignedValue = (short) ((short) 0x00FF & buffer);
        } catch (IOException | I2CFactory.UnsupportedBusNumberException e) {
            Logger.getAnonymousLogger().info("IOEXception " + e.getMessage() + " reading sensor " + sensorId);
        }
        return result;
    }

    private static void pumpOn(int seconds) {
        pump.high();
        pump.low();
        System.out.println("Pump ON");
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pump.high();
        System.out.println("Pump OFF");
    }

    private static void disablePump() {
        if (pump.isLow()) {
            try {
                pump.high();
                Assert.assertTrue(pump.isHigh());
            } catch (AssertionError error) {
                gpio.shutdown();
            }
        }
    }

    private static void openValveA() {
        if (valveA.isHigh())
            valveA.low();
    }

    private static void closeValveA() {
        if (valveA.isLow())
            valveA.high();
    }

    private static void openValveB() {
        if (valveB.isHigh())
            valveB.low();
    }

    private static void closeValveB() {
        if (valveB.isLow())
            valveB.high();
    }

    private static PinState readWaterSensorSmall() {
        return waterSensorSmall.getState();
    }

    private static PinState readWaterSensorMedium() {
        return waterSensorMedium.getState();
    }

    private static PinState readWaterSensorBig() {
        return waterSensorBig.getState();
    }
}