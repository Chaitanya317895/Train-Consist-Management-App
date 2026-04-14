
import java.util.HashSet;
import java.util.Set;

        public class TrainConsistManagementApp {

            public static void main(String[] args) {

                System.out.println("===== Train Consist Management App - UC3 =====");

                // Create a HashSet to store unique bogie IDs
                Set<String> bogieIDs = new HashSet<>();

                System.out.println("\nAdding Bogie IDs...");
                bogieIDs.add("BG101");
                bogieIDs.add("BG102");
                bogieIDs.add("BG103");
                bogieIDs.add("BG101"); // Duplicate
                bogieIDs.add("BG104");
                bogieIDs.add("BG102"); // Duplicate

                System.out.println("\nUnique Bogie IDs:");
                for (String id : bogieIDs) {
                    System.out.println(id);
                }

                System.out.println("\nTotal Unique Bogies: " + bogieIDs.size());

                System.out.println("\nNote: Duplicate IDs were automatically ignored.");
                System.out.println("================================================");
            }
        }