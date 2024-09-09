package com.mycompany.assignment3.shape;

public class Triangle extends Shape{
    private double base;
    private double height;
    
    
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    
    @Override
    public double CalculateArea(){
        return 0.5 * base * height;
    }
}
