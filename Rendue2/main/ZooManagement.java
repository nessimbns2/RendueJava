package Rendue2.main;

import java.util.*;

import Rendue2.entities.Animal;
import Rendue2.entities.Zoo;

public class ZooManagement {
    public static void main(String[] args) {
        System.out.println("Welcome to Zoo Management System");
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal[] animals = new Animal[25];
       
        System.out.println(lion);    
        Zoo zoo = new Zoo("Zoo", "New York",  animals);
        zoo.addAnimal(lion);
        System.out.println(zoo.toString());
        zoo.displayZoo();
        
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, true);
        
        zoo.addAnimal(elephant);
     
        zoo.displayAnimals();
        
    }
}
