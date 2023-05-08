package edu.guilford;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Hello world!
 *
 */
// import collections

public class project5 {
    public static void main(String[] args) throws FileNotFoundException {
        // make objects for Cat
        Cat cat1 = new Cat("Felis margarita", "Sand Cat", 4, 13, "Carnivore", "Desert");
        // make a canine object
        Canine canine1 = new Canine("Canis lupus", "Gray Wolf", 40, 13, "Carnivore", "Forest");
        // mkae a primate
        Primate primate1 = new Primate("Pan troglodytes", "Chimpanzee", 100, 40, "Omnivore", "Forest");
        // Print out each object
        // set all of their conservationStatus
        cat1.setConservationStatus();
        canine1.setConservationStatus();
        primate1.setConservationStatus();
        cat1.printCreature();
        canine1.printCreature();
        primate1.printCreature();
        // put all the creatures into an arraylist
        ArrayList<Creature> creatures = new ArrayList<Creature>();
        creatures.add(cat1);
        creatures.add(canine1);
        creatures.add(primate1);
        // sort them
        Collections.sort(creatures);
        // print them out
        for (Creature creature : creatures) {
            creature.printCreature();
        }
        // put the sorted objects into Output.txt
        // make a new file with the proper pathway
        File file = new File("src/main/java/edu/guilford/Output.txt");

        // make a printwriter

        PrintWriter printWriter = new PrintWriter(file);

        // printWriter the objects into the file
        printWriter.println("Sorted by weight: ");
        for (Creature creature : creatures) {

            printWriter.println("Scientific Name: " + creature.scientificName);
            printWriter.println("Common Name: " + creature.commonName);
            printWriter.println("Average Weight: " + creature.avgWeight);
            printWriter.println("Average Lifespan: " + creature.avglifespan);
            printWriter.println("Diet: " + creature.diet);
            printWriter.println("Habitat: " + creature.habitat);
            printWriter.println("Conservation status: " + creature.conservationStatus + "\n");
        }

        // close the printWriter
        printWriter.close();

    }
}
