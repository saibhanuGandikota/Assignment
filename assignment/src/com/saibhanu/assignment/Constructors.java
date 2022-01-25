package com.saibhanu.assignment;
public class Constructors 
{ 
//Declaration of Instance variables. 
    String name; 
    int age; 
    String address; 

//Declare a default constructor. 
    Constructors() 
    { 
//Initialization of values of Instance variables. 
      name = "SAI BHANU"; 
      age = 21; 
      address = "Gandhi BAZAR"; 

//Print the values on the console. 
    System.out.println(name+ " " +age+ " " +address); 
   } 
//Static method or the main method. 
    public static void main(String[] args) 
    { 
// Create the object of the class using new keyword. 
      Constructors p = new Constructors(); // Calling default constructor. 
    } 
}