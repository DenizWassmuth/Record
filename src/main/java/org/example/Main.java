//  2-Objektorientierung/9-Record

//  Programmierung: Java Record Zoo Projekt
//  Erstelle ein neues Projekt in IntelliJ und lege den Grundstein für das Java Record Zoo Projekt.
//  Erstelle einen Java Record “Animal”, der Eigenschaften für ID, Name, Spezies und Alter haben soll. Wähle passende Feldnamen.
//
//  Programmierung: Record Methoden aufrufen
//  Lass uns nun die automatisch generierten Methoden testen.
//  Erstelle in einer Main-Methode mehrere Tiere.
//  Rufe die automatisch generierten Methoden im Record auf und prüfe, ob sie das tun, was du erwartest (equals, toString).

//  Programmierung: Verschachtelung
//  Jetzt werden wir einen Record als Attribut eines anderen Records verwenden.
//  Erstelle einen Owner Record, der einige Eigenschaften eines Haustierbesitzers speichert (Name, Alter, Adresse).
//  Lass jedes Animal einen Owner haben.

//  Programmierung: Verschachtelung + Wiederverwendung
//  Verwenden eines Records in mehreren anderen Records.
//  Erstelle einen Species Record, der die Eigenschaften einer Tierart speichert (Name, Futterbedarf in Gramm pro Tag).
//  Lass jedes Animal eine Species haben.
//  Lass in deiner Main-Methode mehrere Animal-Objekte die gleiche Species haben.

//  Wenn du diese Aufgabe bereits früher abgeschlossen hast, kannst du die Bonusaufgabe auf der nächsten Seite bearbeiten.
//  Bonus: Zoo
//  Wenn du die Hauptaufgabe bereits abgeschlossen hast, kannst du diese Bonusaufgabe versuchen.
//  Implementiere einen “Zoo” Record, der eine Liste aller Tiere hat und den gesamten Futterbedarf aller Tiere im Zoo berechnen kann.


package org.example;


public class Main {
    static void main() {

        Species ape = new Species("Ape", 1000);

        Animal georgeTheApe = new Animal(1, ape, "George", 5,
                new Owner("Ralf", "Schubert", 55, "Am Horn", 99));

        Animal klausTheApe = new Animal(2, ape, "Klaus", 5,
                new Owner("Ralf", "Schmidt", 55, "Am Tal", 99));

        Animal rogerTheSnake = new Animal(3, new Species("Snake", 100), "Roger", 5,
                new Owner("Hanna", "Lorens", 66, "Am Deich", 76));

        System.out.println();
        System.out.println(georgeTheApe);
        System.out.println(rogerTheSnake);
        System.out.println("George equals Roger: " + georgeTheApe.equals(rogerTheSnake));

        System.out.println();
        System.out.println(georgeTheApe);
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
