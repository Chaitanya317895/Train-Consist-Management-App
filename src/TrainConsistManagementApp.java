

 import java.util.ArrayList;
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

     // Getter Methods
     public String getName() {
         return name;
     }

     public int getCapacity() {
         return capacity;
     }

     @Override
     public String toString() {
         return name + " - Capacity: " + capacity;
     }
 }

 // Main Class
 public class TrainConsistManagementApp {

     public static void main(String[] args) {

         System.out.println("===== Train Consist Management App - UC10 =====");

         // Create a list of passenger bogies
         List<Bogie> bogies = new ArrayList<>();
         bogies.add(new Bogie("Sleeper", 72));
         bogies.add(new Bogie("AC Chair", 56));
         bogies.add(new Bogie("First Class", 24));

         // Display original bogies
         System.out.println("\nPassenger Bogies:");
         bogies.forEach(System.out::println);

         // Calculate total seating capacity using Stream API
         int totalSeats = bogies.stream()
                 .map(Bogie::getCapacity)   // Extract capacity
                 .reduce(0, Integer::sum);  // Aggregate values

         // Display total seating capacity
         System.out.println("\nTotal Seating Capacity of Train: " + totalSeats);

         System.out.println("================================================");
     }
 }