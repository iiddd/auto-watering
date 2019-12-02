package com.iiddd.entity;

import javax.persistence.*;

@Entity
@Table(name = "configurations")
public class ConfigurationEntity {

    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "value")
    private String value;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
