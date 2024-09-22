package Rendue1;

import java.util.Scanner;

public class ZooManagement
{
    public static void main(String[] args){
        System.out.println("");
        System.out.println("Welcome to the Zoo Management System");
        int nbrCages=20;
        String zooName="my zoo";
        System.out.println("Zoo Name : "+zooName + "     Number of cages : "+nbrCages);
        Scanner scanner = new Scanner(System.in);
        do{
        System.out.print("Enter the zoo name: ");
        zooName = scanner.nextLine();
        } while (zooName.length() < 3);
        do {
            System.out.print("Enter the number of cages: ");
            String nbrCagesStr = scanner.nextLine();
            if (nbrCagesStr.matches("\\d+")) {
                nbrCages = Integer.parseInt(nbrCagesStr);
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        } while (true);
        
        
        System.out.println("Zoo Name: " + zooName);
        System.out.println("Number of Cages: " + nbrCages);
    }
}
