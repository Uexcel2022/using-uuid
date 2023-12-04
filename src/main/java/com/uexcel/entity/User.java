package com.uexcel.entity;

import com.uexcel.entity.keys.UserKey;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

@Entity
@IdClass(UserKey.class)
public class User {
    @Id
    private String workCode;
    @Id
    private String projectCode;

    private String name;

    public String getWorkCode() {
        return workCode;
    }

    public void setWorkCode(String workCode) {
        this.workCode = workCode;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User [workCode=" + workCode + ", projectCode=" + projectCode + ", name=" + name + "]";
    }

}
