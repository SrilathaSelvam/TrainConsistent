import java.util.Arrays;

public class TrainConsistent {
    public static void main(String[] args) {

        System.out.println("=== UC17: Arrays.sort() ===");

        String[] bogies = {"Sleeper", "AC", "First Class", "Cargo"};

        Arrays.sort(bogies);

        System.out.println("Sorted Bogies: " + Arrays.toString(bogies));
    }
}