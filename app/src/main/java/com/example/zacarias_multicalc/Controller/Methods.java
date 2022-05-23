package com.example.zacarias_multicalc.Controller;
import java.lang.Math;

public class Methods {
    // Formula For Volume
    public double volumeA(double l, double w, double h) {
        return ((l * w * h) / 3);
    }

    //Formula for Triangle area
    public double triangleArea(double base, double height) {
        return ((0.5) * base * height);
    }
    public double triangleA(double base,double height){return ((base * height)/4);}


    //formula for mass
    public double mass(double volume, double density) {
        return volume*density;
    }
    // formula for acceleration
    public double acceleration(double time,double velocity){
        return time/velocity;
    }
    //formula for kinetic
    public double kinetic(double mass ,double velocity){
        return (0.5 * (mass * (velocity * velocity)));
    }
    //power
    public double power(double work, double time){
        return (work/time);
    }
    //Pressure
    public double pressure(double Force,double Area){
        return (Force/Area);
    }

    //Area of rectangle
    public double areaRectangle (double length1, double width1,double answer) {
        answer = length1 * width1;
        return (answer);
    }
    //Area of Square
    public double square (double square,double answer) {
        answer = square * square;
        return (answer);
    }

    //Sphere
    public double volumeSphere (double r,double answer) {
        answer = (4 / 3) * Math.PI * (r * r * r);
        return (answer);
    }
}

