package Rendue2;
import java.util.List;
public class Zoo {
    public Animal[] animals;
    public String name;
    public String city;
    final int nbrCages= 25;
    public int nbrAnimal;


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
            
            System.out.println("Name: " + this.animals[i].name);
            System.out.println("Family: " + this.animals[i].family);
            System.out.println("Age: " + this.animals[i].age);
            System.out.println("Is Mammal: " + this.animals[i].isMammal);
            System.out.println(i);
        }
    }

public boolean addAnimal(Animal animal){
    if (nbrAnimal >= animals.length && searchAnimal(animal) != -1  && nbrAnimal >= nbrCages){
        return false;
    }
    animals[nbrAnimal] = animal;
    nbrAnimal++;
        return true;
    
}

public void displayAnimals(){
    for (int i = 0; i < this.nbrAnimal; i++) {
        System.out.println("Name: " + this.animals[i].name);
        System.out.println("Family: " + this.animals[i].family);
        System.out.println("Age: " + this.animals[i].age);
        System.out.println("Is Mammal: " + this.animals[i].isMammal);
    }
}
public int searchAnimal(Animal animal){
    for (int i = 0; i < animals.length; i++) {
        if (animals[i].name.equals(animal.name)){
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