import java.util.regex.*;

public class TrainConsistent {
    public static void main(String[] args) {

        System.out.println("=== UC11: Regex Validation ===");

        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        Pattern trainPattern = Pattern.compile("TRN-\\d{4}");
        Pattern cargoPattern = Pattern.compile("PET-[A-Z]{2}");

        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        System.out.println("Train ID valid: " + trainMatcher.matches());
        System.out.println("Cargo Code valid: " + cargoMatcher.matches());
    }
}