
import java.util.ArrayList;

    public class TrainConsistManagementApp {

        public static void main(String[] args) {

            System.out.println("===== Train Consist Management App - UC2 =====");

            // Create an ArrayList to store passenger bogies
            ArrayList<String> passengerBogies = new ArrayList<>();

            // Add passenger bogies
            passengerBogies.add("Sleeper");
            passengerBogies.add("AC Chair");
            passengerBogies.add("First Class");

            // Display bogies after insertion
            System.out.println("\nPassenger Bogies after Addition:");
            System.out.println(passengerBogies);

            // Remove a bogie (AC Chair)
            passengerBogies.remove("AC Chair");
            System.out.println("\nAfter Removing 'AC Chair':");
            System.out.println(passengerBogies);

            // Check if a bogie exists
            if (passengerBogies.contains("Sleeper")) {
                System.out.println("\n'Sleeper' bogie exists in the train.");
            } else {
                System.out.println("\n'Sleeper' bogie does not exist in the train.");
            }

            // Display final list
            System.out.println("\nFinal Passenger Bogies:");
            System.out.println(passengerBogies);

            System.out.println("\nProgram executed successfully.");
        }
    }