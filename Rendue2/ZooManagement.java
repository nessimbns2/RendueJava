package Rendue2;

public class ZooManagement {
    public static void main(String[] args) {
        System.out.println("Welcome to Zoo Management System");
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal[] animals = {lion};
        Zoo zoo = new Zoo("Zoo", "New York", 10, animals);
        System.out.println(lion);    
        System.out.println(zoo.toString());
       // zoo.displayZoo();
    }
}
