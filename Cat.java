package com.mycompany.assignment3.simpleprogram;

public class Cat extends Mammal implements Animal{
    
    @Override
    public void makeSound(){
        System.out.println("Cat is Meow..");
    }
    
    @Override
    public void eat(){
        System.out.println("Cat is Eating...");
    }
}
