package com.iiddd.service;

import com.iiddd.entity.ConfigurationEntity;
import com.iiddd.enums.Configurations;
import com.iiddd.repository.watering.WateringConfigurationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WateringConfigurationService {

    @Autowired
    private WateringConfigurationRepository wateringConfigurationRepository;

    public boolean getConfigurationEntity(Configurations configuration) {
        return Boolean.parseBoolean(wateringConfigurationRepository.findByName(configuration.getValue()).getValue());
    }

    public void setConfigurationEntity(Configurations configName, String value) {
        ConfigurationEntity configurationEntity = new ConfigurationEntity();
        configurationEntity.setId(1);
        configurationEntity.setName(configName.getValue());
        configurationEntity.setValue(value);
        wateringConfigurationRepository.save(configurationEntity);
    }
}
