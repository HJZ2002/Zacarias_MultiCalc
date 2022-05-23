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

    private double kinetic,Speed,Velocity1;
    //setters kinetic
    public void setKinetic(double kinetic) {
        this.kinetic = kinetic;
    }

    public void setSpeed(double mass1) {
        Speed = mass1;
    }

    public void setVelocity1(double velocity1) {
        Velocity1 = velocity1;
    }
    //getters kinetic
    public double getKinetic() {
        return kinetic;
    }

    public double getSpeed() {
        return Speed;
    }

    public double getVelocity1() {
        return Velocity1;
    }

    //power
    private double power,work,time1;
    //setters
    public void setPower(double power) {
        this.power = power;
    }

    public void setWork(double work) {
        this.work = work;
    }

    public void setTime1(double time1) {
        this.time1 = time1;
    }
    //getters
    public double getPower() {
        return power;
    }

    public double getWork() {
        return work;
    }

    //pressure
    private double pressure,force,area1;

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public void setForce(double force) {
        this.force = force;
    }

    public void setArea1(double area1) {
        this.area1 = area1;
    }

    public double getTime1() {
        return time1;
    }

    public double getPressure() {
        return pressure;
    }

    public double getForce() {
        return force;
    }

    public double getArea1() {
        return area1;
    }

    //Rectangle
    private double rectangle,length1,width1;

    public double getRectangle() {
        return rectangle;
    }

    public void setRectangle(double rectangle) {
        this.rectangle = rectangle;
    }

    public double getLength1() {
        return length1;
    }

    public void setLength1(double length1) {
        this.length1 = length1;
    }

    public double getWidth1() {
        return width1;
    }

    public void setWidth1(double width1) {
        this.width1 = width1;
    }

    //Square
    private double square,square1,answer;

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getSquare1() {
        return square1;
    }

    public void setSquare1(double square1) {
        this.square1 = square1;
    }

    public double getAnswer() {
        return answer;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }

    //volumeSphere
    private double volumeSphere,r,answer1;

    public double getVolumeSphere() {
        return volumeSphere;
    }

    public void setVolumeSphere(double volumeSphere) {
        this.volumeSphere = volumeSphere;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getAnswer1() {
        return answer1;
    }

    public void setAnswer1(double answer1) {
        this.answer1 = answer1;
    }
}
