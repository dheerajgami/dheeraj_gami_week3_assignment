package com.mycompany.assignment3.simpleprogram;

public class Dog extends Mammal implements Animal{

    @Override
    public void makeSound() {
        System.out.println("Dog is Barking...");
    }
    
    @Override
    public void eat(){
        System.out.println("Dog is Eating....");
    }
    
}
