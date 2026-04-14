
 import java.util.ArrayList;
 import java.util.Comparator;
 import java.util.List;

 // Bogie Class
 class Bogie {
     private String name;
     private int capacity;

     // Constructor
     public Bogie(String name, int capacity) {
         this.name = name;
         this.capacity = capacity;
     }

     // Getters
     public String getName() {
         return name;
     }

     public int getCapacity() {
         return capacity;
     }

     // Display bogie details
     @Override
     public String toString() {
         return name + " - Capacity: " + capacity;
     }
 }

 // Main Class
 public class TrainConsistManagementApp {

     public static void main(String[] args) {

         System.out.println("===== Train Consist Management App - UC7 =====");

         // Create a List to store passenger bogies
         List<Bogie> passengerBogies = new ArrayList<>();

         // Add bogies with capacities
         passengerBogies.add(new Bogie("Sleeper", 72));
         passengerBogies.add(new Bogie("AC Chair", 56));
         passengerBogies.add(new Bogie("First Class", 24));

         // Display bogies before sorting
         System.out.println("\nBefore Sorting:");
         for (Bogie bogie : passengerBogies) {
             System.out.println(bogie);
         }

         // Sort bogies by capacity using Comparator and Lambda Expression
         passengerBogies.sort(
                 Comparator.comparingInt(Bogie::getCapacity).reversed()
         );

         // Display bogies after sorting
         System.out.println("\nAfter Sorting by Capacity (Descending):");
         for (Bogie bogie : passengerBogies) {
             System.out.println(bogie);
         }

         System.out.println("\nProgram executed successfully.");
         System.out.println("================================================");
     }
 }