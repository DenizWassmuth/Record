package org.example;

import java.util.HashMap;
import java.util.Map;

public record Zoo() {

    static Map<Integer, Animal> animals = new HashMap<>();

    void addAnimal(Animal animal)
    {
        if (animal == null)
        {
            return;
        }

        if (animals.containsKey(animal.id()))
        {
            return;
        }

        animals.put(animal.id(), animal);
    }

   void calculateFoodNecessary() {

        if (animals.isEmpty()) {
            return;
        }

        float totalFood = 0;

        for (Animal animal : animals.values()) {

            System.out.println(animal.name() + ", species " +  animal.species().nameOfSpecies() + " needs " + animal.species().foodInGrams() + " food per day.");

            totalFood += animal.species().foodInGrams();
        }

        System.out.println("Total food needed per day: " + totalFood + " g");
    }
}
