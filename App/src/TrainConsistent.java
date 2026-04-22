import java.util.HashSet;
import java.util.Set;

public class TrainConsistent {

    public static void main(String[] args) {

        System.out.println("=== UC3: Unique Bogie IDs using HashSet ===");

        // Create HashSet
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs (including duplicate)
        bogieIds.add("B1");
        bogieIds.add("B2");
        bogieIds.add("B3");
        bogieIds.add("B2"); // duplicate

        // Display unique bogies
        System.out.println("Unique Bogie IDs: " + bogieIds);
    }
}