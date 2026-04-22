import java.util.*;

public class TrainConsistent {
    public static void main(String[] args) {

        System.out.println("=== UC20: Safe Search ===");

        List<String> bogies = new ArrayList<>(); // empty list

        try {
            if (bogies.isEmpty()) {
                throw new IllegalStateException("No bogies available for search!");
            }

            // Search logic (won’t run if empty)
            System.out.println("Searching...");

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}