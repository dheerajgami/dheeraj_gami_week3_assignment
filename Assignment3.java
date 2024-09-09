
package com.mycompany.assignment3;

import com.mycompany.assignment3.shape.Circle;
import com.mycompany.assignment3.shape.Rectangle;
import com.mycompany.assignment3.shape.Shape;
import com.mycompany.assignment3.shape.Triangle;
import com.mycompany.assignment3.simpleprogram.Cat;
import com.mycompany.assignment3.simpleprogram.Dog;
import com.mycompany.assignment3.vehicle.Bike;
import com.mycompany.assignment3.vehicle.Car;
import com.mycompany.assignment3.vehicle.Vehicle;

public class Assignment3 {

    public static void main(String[] args) {
        System.out.println(" ***** Demonstrated Polymorphism ***** ");
        Vehicle myVehicle;
        
        myVehicle = new Car();
        myVehicle.getStart();
        
        myVehicle = new Bike();
        myVehicle.getStart();
        
        System.out.println("\n ==================================================");
        
        System.out.println("\n Shape of Circle, Rectangle or Triangle......");
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(10,5.5);
        Shape triangle = new Triangle(15, 10.5);
        
        System.out.println("Area of Circle = "+circle.CalculateArea());
        System.out.println("Area of Rectangle = "+rectangle.CalculateArea());
        System.out.println("Area of Triangle = "+triangle.CalculateArea());
    
        System.out.println("\n ==================================================");
        System.out.println("***** Simple Program for Abstract Class and Interface *****");
        
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        dog.makeSound();
        dog.eat();
        
        cat.eat();
        cat.makeSound();
        
    }
}
