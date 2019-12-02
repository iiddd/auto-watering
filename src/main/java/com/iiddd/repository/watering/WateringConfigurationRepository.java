package com.iiddd.repository.watering;

import com.iiddd.entity.ConfigurationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WateringConfigurationRepository extends JpaRepository<ConfigurationEntity, Long> {

    ConfigurationEntity findByName(String name);
}
