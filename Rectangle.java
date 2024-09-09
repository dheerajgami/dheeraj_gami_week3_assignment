package com.mycompany.assignment3.shape;

public class Rectangle extends Shape{
    private double length;
    private double breadth;
    
    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    
    @Override
    public double CalculateArea(){
        return length * breadth;
    }
    
    
}
