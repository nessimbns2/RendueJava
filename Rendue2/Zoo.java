package Rendue2;
public class Zoo {
    public Animal[] animals;
    public String name;
    public String city;
    public int nbrCages;


    public Zoo(String name, String city, int nbrCages, Animal[] animals) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = animals;
    }
    @Override
    public String toString() {
        return "Zoo Name: " + name + "\n" +
               "City: " + city + "\n" +
               "Number of cages: " + nbrCages + "\n" ;
    }

    public void displayZoo(){
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of cages: " + nbrCages);
        System.out.println("Animals in the zoo: ");
        for (Animal animal : animals) {
            System.out.println("Name: " + animal.name);
            System.out.println("Family: " + animal.family);
            System.out.println("Age: " + animal.age);
            System.out.println("Is Mammal: " + animal.isMammal);
        }
    }


}
