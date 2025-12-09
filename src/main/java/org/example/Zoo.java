package org.example;

import java.util.ArrayList;
import java.util.List;

public record Zoo() {

    static List<Animal> animals = new ArrayList<>();

    void addAnimal(Animal animal)
    {
        animals.add(animal);
    }

   void calculateFoodNecessary() {
        if (animals.isEmpty()) {
            return;
        }

        float totalFood = 0;

        for (Animal animal : animals) {

            System.out.println(animal.name() + ", species " +  animal.species().nameOfSpecies() + " needs " + animal.species().foodInGrams() + " food per day.");

            totalFood += animal.species().foodInGrams();
        }

        System.out.println("Total food needed per day: " + totalFood);
    }
}
