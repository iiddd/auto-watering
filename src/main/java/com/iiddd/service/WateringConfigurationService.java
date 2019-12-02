package com.iiddd.service;

import com.iiddd.entity.ConfigurationEntity;
import com.iiddd.repository.watering.WateringConfigurationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WateringConfigurationService {

    @Autowired
    private WateringConfigurationRepository wateringConfigurationRepository;

    public ConfigurationEntity getConfigurationEntity(String propertyName) {
        return wateringConfigurationRepository.findByName(propertyName);
    }

    public void setConfigurationEntity(String name, String value) {
        ConfigurationEntity configurationEntity = new ConfigurationEntity();
        configurationEntity.setId(1);
        configurationEntity.setName(name);
        configurationEntity.setValue(value);
        wateringConfigurationRepository.save(configurationEntity);
    }
}
