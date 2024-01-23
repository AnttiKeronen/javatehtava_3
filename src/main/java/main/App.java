package main;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anna eläintarhalle nimi:");
        String zooName = scanner.nextLine();
        Zoo zoo = new Zoo(zooName);
        boolean exit = false;

        while(!exit) {
            System.out.println("1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma");
        
            if (scanner.hasNext()) {
                int valinta = 0;
                String stringInput = scanner.nextLine();
                valinta = Integer.parseInt(stringInput);
            

            switch(valinta) {
                case 1:
                    System.out.println("Mikä laji?:");
                    String laji = scanner.nextLine();
                    
                    System.out.println("Anna eläimen nimi:");
                    String nimi = scanner.nextLine();

                    System.out.println("Anna eläimen ikä:");
                    int ikä = scanner.nextInt();
                    scanner.nextLine();

                    Animal newAnimal = new Animal(laji, nimi, ikä);
                    zoo.addAnimal(newAnimal);
                    break;

                    
                case 2:
                    System.out.println(zooName + " pitää sisällään seuraavat eläimet:");
                    zoo.listAnimals();
                    break;
                    
                case 3:
                    System.out.println("Kuinka monta kierrosta?");
                    int kierrokset = scanner.nextInt();
                    scanner.nextLine();
                    zoo.runAnimals(kierrokset);
                    break;

                case 0:
                    System.out.println("Kiitos ohjelman käytöstä.");
                    exit = true;
                    break;

                default:
                    System.out.println("Syöte oli väärä.");
                    break;
                }
            }
        }
        scanner.close();
    }
}
