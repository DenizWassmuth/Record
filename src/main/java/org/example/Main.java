package org.example;


public class Main {
    static void main() {

        Species ape = new Species("Ape", 1000);

        Animal georgeTheApe = new Animal(1, ape, "George", 5,
                new Owner("Ralf", "Schubert", 55, "Am Horn", 99));

        Animal klausTheApe = new Animal(1, ape, "George", 5,
                new Owner("Ralf", "Schmidt", 55, "Am Tal", 99));

        Animal rogerTheSnake = new Animal(2, new Species("Snake", 100), "Roger", 5,
                new Owner("Hanna", "Lorens", 66, "Am Deich", 76));

        System.out.println();
        System.out.println(georgeTheApe);
        //System.out.print("\n");
        System.out.println(rogerTheSnake);
        System.out.println("George equals Roger: " + georgeTheApe.equals(rogerTheSnake));

        System.out.println();
        System.out.println(georgeTheApe);
        //System.out.print("\n");
        System.out.println(klausTheApe);
        System.out.println("George equals Klaus: " + georgeTheApe.equals(klausTheApe));

        System.out.println();

        Zoo zoo = new Zoo();
        zoo.addAnimal(georgeTheApe);
        zoo.addAnimal(rogerTheSnake);
        zoo.addAnimal(klausTheApe);

        zoo.calculateFoodNecessary();
    }
}
