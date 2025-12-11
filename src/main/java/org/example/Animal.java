package org.example;

public record Animal(int id, Species species, String name, int age, Owner owner) {

    public Animal withName(String name){
        return new Animal(id, species, name, age, owner);
    }
}
