package Rendue2;
import java.util.List;
public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages = 25;
    private int nbrAnimal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Zoo name cannot be empty");
        }
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public int getNbrAnimal() {
        return nbrAnimal;
    }

    public void setNbrAnimal(int nbrAnimal) {
        this.nbrAnimal = nbrAnimal;
    }


    public Zoo(String name, String city, Animal[] animals) {
        this.name = name;
        this.city = city;
        this.animals = animals;
        nbrAnimal = 0;
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
        for (int i = 0; i < this.nbrAnimal; i++) {
            System.out.println("Name: " + this.animals[i].getName());
            System.out.println("Family: " + this.animals[i].getFamily());
            System.out.println("Age: " + this.animals[i].getAge());
            System.out.println("Is Mammal: " + this.animals[i].isMammal());
            System.out.println(i);
        }
    }

public boolean addAnimal(Animal animal){
    if (nbrAnimal >= animals.length && searchAnimal(animal) != -1  && this.isZooFull()){
        return false;
    }
    animals[nbrAnimal] = animal;
    nbrAnimal++;
        return true;
    
}

public void displayAnimals(){
    for (int i = 0; i < this.nbrAnimal; i++) {
        System.out.println("Name: " + this.animals[i].getName());
        System.out.println("Family: " + this.animals[i].getFamily());
        System.out.println("Age: " + this.animals[i].getAge());
        System.out.println("Is Mammal: " + this.animals[i].isMammal());
    }
}
public int searchAnimal(Animal animal){
    for (int i = 0; i < animals.length; i++) {
        if (animals[i].getName().equals(animal.getName())){
            return i;
        }
    }
    return -1;
}

public boolean removeAnimal(Animal animal){
    int index = searchAnimal(animal);
    if (index == -1){
        return false;
    }
    for (int i = index; i < nbrAnimal - 1; i++) {
        animals[i] = animals[i + 1];
    }
    nbrAnimal--;
    return true;}


    public boolean isZooFull(){
        return nbrAnimal == nbrCages;
    }

    public Zoo compareZoo(Zoo zoo1 , Zoo zoo2){
        if (zoo1.nbrAnimal > zoo2.nbrAnimal){
            return zoo1;
        }
        else if    (zoo1.nbrAnimal == zoo2.nbrAnimal){
            return null;
        }
        return zoo2;
    }

}