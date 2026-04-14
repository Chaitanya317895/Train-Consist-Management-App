
import java.util.LinkedHashSet;

public class /**
 * Train Consist Management App
 * Use Case 5: Preserve Insertion Order of Bogies (LinkedHashSet)
 *
 * This program demonstrates how LinkedHashSet maintains the
 * insertion order of bogies while preventing duplicates.
 *
 * Author: Chaitanya
 * Version: 5.0
 */

import java.util.LinkedHashSet;

public class TrainConsistManagementApp{

    public static void main(String[] args) {

        System.out.println("===== Train Consist Management App - UC5 =====");

        // Create a LinkedHashSet to store bogies
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Adding bogies to the train formation
        System.out.println("\nAttaching Bogies...");
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add a duplicate bogie
        System.out.println("Attempting to add duplicate bogie: Sleeper");
        trainFormation.add("Sleeper"); // Duplicate (ignored automatically)

        // Display the final train formation
        System.out.println("\nFinal Train Formation (Insertion Order Preserved):");
        System.out.println(trainFormation);

        // Display each bogie individually
        System.out.println("\nOrdered Bogie Sequence:");
        for (String bogie : trainFormation) {
            System.out.println("→ " + bogie);
        }

        System.out.println("\nTotal Unique Bogies: " + trainFormation.size());
        System.out.println("================================================");
    }
} {

    public static void main(String[] args) {

        System.out.println("===== Train Consist Management App - UC5 =====");

        // Create a LinkedHashSet to store bogies
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Adding bogies to the train formation
        System.out.println("\nAttaching Bogies...");
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add a duplicate bogie
        System.out.println("Attempting to add duplicate bogie: Sleeper");
        trainFormation.add("Sleeper"); // Duplicate (ignored automatically)

        // Display the final train formation
        System.out.println("\nFinal Train Formation (Insertion Order Preserved):");
        System.out.println(trainFormation);

        // Display each bogie individually
        System.out.println("\nOrdered Bogie Sequence:");
        for (String bogie : trainFormation) {
            System.out.println("→ " + bogie);
        }

        System.out.println("\nTotal Unique Bogies: " + trainFormation.size());
        System.out.println("================================================");
    }
}