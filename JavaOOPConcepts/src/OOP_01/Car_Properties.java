package OOP_01;

import java.util.Date;

public class Car_Properties {
    private String brand;
    private String model;
    private String segment;
    private String color;
    private int yearMade;
    private double kmLong;
    private String engineVersion;
    private int wheels;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearMade() {
        return yearMade;
    }

    public void setYearMade(int yearMade) {
        if (yearMade < 1990){
            System.out.println("Year Made can not be smaller than 1990");
            } else if (yearMade> 2023){
            System.out.println("Year Made can not be smaller than 1990");
            } else {
            this.yearMade = yearMade;}
    }

    public double getKmLong() {
        return kmLong;
    }

    public void setKmLong(double kmLong) {
        this.kmLong = kmLong;
    }

    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}