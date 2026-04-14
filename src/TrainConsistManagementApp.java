

import java.util.LinkedList;

            public class TrainConsistManagementApp {

                public static void main(String[] args) {

                    System.out.println("===== Train Consist Management App - UC4 =====");

                    // Create a LinkedList to represent the train consist
                    LinkedList<String> trainConsist = new LinkedList<>();

                    // Add bogies to the train
                    trainConsist.add("Engine");
                    trainConsist.add("Sleeper");
                    trainConsist.add("AC Coach");
                    trainConsist.add("Cargo");
                    trainConsist.add("Guard");

                    System.out.println("\nInitial Train Consist:");
                    System.out.println(trainConsist);

                    // Insert Pantry Car at position 2 (index 2)
                    trainConsist.add(2, "Pantry Car");
                    System.out.println("\nAfter Adding Pantry Car at Position 2:");
                    System.out.println(trainConsist);

                    // Remove the first bogie (Engine)
                    trainConsist.removeFirst();
                    System.out.println("\nAfter Removing First Bogie (Engine):");
                    System.out.println(trainConsist);

                    // Remove the last bogie (Guard)
                    trainConsist.removeLast();
                    System.out.println("\nAfter Removing Last Bogie (Guard):");
                    System.out.println(trainConsist);

                    // Display the final ordered train consist
                    System.out.println("\nFinal Ordered Train Consist:");
                    for (String bogie : trainConsist) {
                        System.out.println("→ " + bogie);
                    }

                    System.out.println("\nProgram executed successfully.");
                    System.out.println("================================================");
                }
            }