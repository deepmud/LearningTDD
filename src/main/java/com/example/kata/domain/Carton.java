package com.example.kata.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Carton {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int cartonId;
    String cartonName;
    String cartonShape;
    boolean isFull;

    public Carton() {
    }

    public Carton(String cartonName,String cartonShape, boolean isFull) {
        this.cartonName = cartonName;
        this. cartonShape = cartonShape;
        this.isFull = isFull;
    }

    public int getCartonId() {
        return cartonId;
    }

    public String getCartonShape() {
        return cartonShape;
    }

    public boolean isFull() {
        return isFull;
    }

    public String getCartonName() {
        return cartonName;
    }

    @Override
    public String toString() {
        return "Carton{" +
                "cartonId=" + cartonId +
                ", cartonName='" + cartonName + '\'' +
                ", cartonShape='" + cartonShape + '\'' +
                ", isFull=" + isFull +
                '}';
    }
}
