package com.iiddd.utils;

import com.diozero.PCF8591;
import com.iiddd.enums.Configurations;
import com.iiddd.service.WateringConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.text.DecimalFormat;

public class WaterUtils {

    @Autowired
    WateringConfigurationService wateringConfigurationService;

    private static final String DECIMAL_FORMAT_PATTERN = "###.##";
    private static final String WATER_PUMP_NAME = "Water Pump";
    private static final String VALVE_A_NAME = "Valve A";
    private static final String VALVE_B_NAME = "Valve B";
    //    private static final GpioController gpio = GpioFactory.getInstance();
    private static final int SMALL_SENSOR_ID = 0;
    private static final int MEDIUM_SENSOR_ID = 1;
    private static final int LARGE_SENSOR_ID = 2;
    //    private static GpioPinDigitalOutput pump = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_15, WATER_PUMP_NAME, HIGH);
//    private static GpioPinDigitalOutput valveA = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_04, VALVE_A_NAME, HIGH);
//    private static GpioPinDigitalOutput valveB = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_05, VALVE_B_NAME, HIGH);
    private static final int SENSOR_ADDR = 0x48;

    public void doAutomation() {
        while (true) {
            if (wateringConfigurationService.getConfigurationEntity(Configurations.AUTOMATION_STATUS)) {
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
            }
        }
    }

//    public static void waterSmall() {
//        openValveA();
//        pumpOn(7);
//        closeValveA();
//    }

//    public static void waterMedium() {
//        openValveB();
//        pumpOn(7);
//        closeValveB();
//    }

    public static void waterLarge() {
        pumpOn(7);
    }

    static String getSmallPlantsSoilMoisture() {
        return readSensorAnalogData(SMALL_SENSOR_ID);
    }

    static String getMediumPlantsSoilMoisture() {
        return readSensorAnalogData(MEDIUM_SENSOR_ID);
    }

    static String getLargePlantsSoilMoisture() {
        return readSensorAnalogData(LARGE_SENSOR_ID);
    }

    private static String readSensorAnalogData(int sensorId) {
        float sensorData;
        DecimalFormat df = new DecimalFormat(DECIMAL_FORMAT_PATTERN);
        try (PCF8591 pcf8591 = new PCF8591()) {
            sensorData = pcf8591.getValue(sensorId);
        }
        return df.format(sensorData);
    }

    private static void pumpOn(int seconds) {
//        pump.high();
//        pump.low();
        System.out.println("Pump ON");
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        pump.high();
        System.out.println("Pump OFF");
    }

//    private static void disablePump() {
//        if (pump.isLow()) {
//            try {
//                pump.high();
//                Assert.assertTrue(pump.isHigh());
//            } catch (AssertionError error) {
//                gpio.shutdown();
//            }
//        }
//    }

//    private static void openValveA() {
//        if (valveA.isHigh())
//            valveA.low();
//    }
//
//    private static void closeValveA() {
//        if (valveA.isLow())
//            valveA.high();
//    }
//
//    private static void openValveB() {
//        if (valveB.isHigh())
//            valveB.low();
//    }
//
//    private static void closeValveB() {
//        if (valveB.isLow())
//            valveB.high();
//    }
}