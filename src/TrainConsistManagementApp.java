

import java.util.*;
import java.util.stream.Collectors;

// Bogie Class
class Bogie {
    private String name;
    private String type;
    private int capacity;

    // Constructor
    public Bogie(String name, String type, int capacity) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

// Main Class
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("===== Train Consist Management App - UC9 =====");

        // Create a list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", "Passenger", 72));
        bogies.add(new Bogie("AC Chair", "Passenger", 56));
        bogies.add(new Bogie("First Class", "Passenger", 24));
        bogies.add(new Bogie("Rectangular", "Goods", 100));
        bogies.add(new Bogie("Cylindrical", "Goods", 80));
        bogies.add(new Bogie("Sleeper", "Passenger", 72)); // Duplicate for grouping

        // Display original list
        System.out.println("\nOriginal Bogie List:");
        bogies.forEach(System.out::println);

        // Group bogies by type
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        // Display grouped bogies
        System.out.println("\nGrouped Bogies by Type:");
        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\n" + entry.getKey() + " Bogies:");
            entry.getValue().forEach(bogie ->
                    System.out.println("  - " + bogie));
        }

        System.out.println("\nProgram executed successfully.");
        System.out.println("================================================");
    }
}