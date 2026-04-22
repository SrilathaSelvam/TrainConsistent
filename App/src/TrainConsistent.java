
import java.util.ArrayList;
import java.util.List;

public class TrainConsistent {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies after insertion
        System.out.println("Bogies after addition: " + passengerBogies);

        // Remove a bogie
        passengerBogies.remove("AC Chair");

        // Check existence
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("Does Sleeper exist? " + exists);

        // Final state of bogies
        System.out.println("Final bogie list: " + passengerBogies);

        System.out.println("Program continues...");
    }
}