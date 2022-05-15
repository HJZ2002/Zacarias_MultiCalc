package com.example.zacarias_multicalc.Controller;
import java.lang.Math;

public class Methods {
    // Formula For Volume
    public double volumeL(double v, double r) {
        return ((v) / ((Math.PI) * (r * r)));
    }
    public double volumeH(double r, double h) {
        return ((Math.PI) * (r * r) * (h));
    }
    public double volumeR(double v, double h) {
        return (Math.sqrt((v) / (Math.PI * h)));
    }
    public double volumeA(double l, double w, double h) {
        return ((l * w * h) / 3);
    }


    //Formula for area

    public double triangleArea(double base, double height) {
        return ((0.5) * base * height);
    }
    public double triangleA(double base,double height){return ((base * height)/4);}


    //formula for mass
    public double mass(double volume, double density) {
        return volume *density;
    }
    // formula for acceleration
    public double acceleration(double time,double velocity){
        return time /velocity;
    }

    //formula for kinetic
    public double kinetic(double mass ,double velocity){
        return (0.5 * (mass * (velocity * velocity)));
    }

}
