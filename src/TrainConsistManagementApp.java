import java.util.ArrayList;
 import java.util.List;
 import java.util.stream.Collectors;

 // Bogie Class (Reusable from UC7)
 class Bogie {
     private String name;
     private int capacity;

     public Bogie(String name, int capacity) {
         this.name = name;
         this.capacity = capacity;
     }

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
 public class TrainConsistManagementApp {

     public static void main(String[] args) {

         System.out.println("===== Train Consist Management App - UC8 =====");

         // Create list of passenger bogies
         List<Bogie> passengerBogies = new ArrayList<>();
         passengerBogies.add(new Bogie("Sleeper", 72));
         passengerBogies.add(new Bogie("AC Chair", 56));
         passengerBogies.add(new Bogie("First Class", 24));
         passengerBogies.add(new Bogie("Luxury Coach", 80));

         // Display original list
         System.out.println("\nOriginal Passenger Bogies:");
         passengerBogies.forEach(System.out::println);

         // Filter bogies with capacity greater than 60
         int threshold = 60;
         List<Bogie> filteredBogies = passengerBogies.stream()
                 .filter(b -> b.getCapacity() > threshold)
                 .collect(Collectors.toList());

         // Display filtered bogies
         System.out.println("\nFiltered Bogies (Capacity > " + threshold + "):");
         filteredBogies.forEach(System.out::println);

         // Verify original list remains unchanged
         System.out.println("\nOriginal List After Filtering (Unchanged):");
         passengerBogies.forEach(System.out::println);

         System.out.println("================================================");
     }
 }
