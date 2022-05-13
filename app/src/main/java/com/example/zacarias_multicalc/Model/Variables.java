package com.example.zacarias_multicalc.Model;

public class Variables {
    //volume variables
    private double volume,length,width,height;

    //setters volume
    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //getters volume
    public double getVolume() {
        return volume;
    }

    public double getLength() {
        return length;
    }


    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    //setters area
    private double area,base,height1;

    public void setArea(double area) {
        this.area = area;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight1(double height1) {
        this.height1 = height1;
    }

    //getters area
    public double getArea() {
        return area;
    }

    public double getBase() {
        return base;
    }

    public double getHeight1() {
        return height1;
    }

    //setters mass
    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setVolume1(double volume1) {
        Volume1 = volume1;
    }

    public void setDensity(double density) {
        this.density = density;
    }
    //getters mass
    private double mass,Volume1,density;
    public double getMass() {
        return mass;
    }

    public double getVolume1() {
        return Volume1;
    }

    private double acceleration,time,velocity;
    //setters acceleration
    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    //getters acceleration
    public double getDensity() {
        return density;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public double getTime() {
        return time;
    }

    public double getVelocity() {
        return velocity;
    }

    private double kinetic,Mass1,Velocity1;
    //setters kinetic
    public void setKinetic(double kinetic) {
        this.kinetic = kinetic;
    }

    public void setMass1(double mass1) {
        Mass1 = mass1;
    }

    public void setVelocity1(double velocity1) {
        Velocity1 = velocity1;
    }
    //getters kinetic
    public double getKinetic() {
        return kinetic;
    }

    public double getMass1() {
        return Mass1;
    }

    public double getVelocity1() {
        return Velocity1;
    }

}
