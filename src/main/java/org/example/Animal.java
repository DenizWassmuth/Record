package org.example;

import java.util.Objects;

public record Animal(int id, Species species, String name, int age, Owner owner) {

//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Animal animal = (Animal) o;
//        return id == animal.id && age == animal.age
//                && Objects.equals(name, animal.name)
//                && Objects.equals(species, animal.species)
//                && Objects.equals(owner, animal.owner);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, species, name, age, owner);
//    }
//
//    @Override
//    public String toString() {
//        return "Animal{" +
//                "id=" + id +
//                ", species='" + species + '\'' +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                ", owner=" + owner +
//                '}';
//    }
}
