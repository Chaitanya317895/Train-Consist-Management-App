 import java.util.HashMap;
 import java.util.Map;

 public class TrainConsistManagementApp {

     public static void main(String[] args) {

         System.out.println("===== Train Consist Management App - UC6 =====");

         // Create a HashMap to store bogie-capacity mappings
         Map<String, Integer> bogieCapacityMap = new HashMap<>();

         // Insert passenger bogie capacities
         bogieCapacityMap.put("Sleeper", 72);
         bogieCapacityMap.put("AC Chair", 54);
         bogieCapacityMap.put("First Class", 24);

         // Insert goods bogie load capacities (in tons)
         bogieCapacityMap.put("Rectangular Goods", 100);
         bogieCapacityMap.put("Cylindrical Goods", 80);

         // Display all bogie capacities
         System.out.println("\nBogie Capacity Details:");
         for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
             System.out.println(entry.getKey() + " -> " + entry.getValue());
         }

         // Demonstrate fast lookup
         System.out.println("\nCapacity Lookup:");
         String bogieType = "Sleeper";
         System.out.println("Capacity of " + bogieType + ": "
                 + bogieCapacityMap.get(bogieType));

         System.out.println("================================================");
     }
 }