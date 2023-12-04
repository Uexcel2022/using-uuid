package com.uexcel.entity;

import com.uexcel.entity.keys.Studentakay;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Embedded
    @Id
    private Studentakay id;
    private String name;

    public Studentakay getId() {
        return id;
    }

    public void setId(Studentakay id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

}
