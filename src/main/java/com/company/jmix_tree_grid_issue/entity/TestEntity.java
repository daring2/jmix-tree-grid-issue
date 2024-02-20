package com.company.jmix_tree_grid_issue.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.JmixId;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import java.util.UUID;

@JmixEntity(name = "sb_TestEntity")
public class TestEntity {
    @JmixGeneratedValue
    @JmixId
    private UUID id;

    private String code;

    @InstanceName
    private String name;

    private TestEntity parent;

    public TestEntity getParent() {
        return parent;
    }

    public void setParent(TestEntity parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}