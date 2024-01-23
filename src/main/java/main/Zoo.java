package main;

import java.util.ArrayList;

class Zoo {
    private String nimi;
    private ArrayList<Animal> animals;

    public Zoo(String nimi) {
        this.nimi = nimi;
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void listAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public void runAnimals(int rounds) {
        for (int animalIndex = 0; animalIndex < animals.size(); animalIndex++) {
            for (int round = 0; round < rounds; round++) {
                animals.get(animalIndex).run();
            }
        }
    }
}

