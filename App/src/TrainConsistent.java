public class TrainConsistent {
    public static void main(String[] args) {

        System.out.println("=== UC18: Linear Search ===");

        String[] bogieIds = {"B1", "B2", "B3", "B4"};
        String key = "B3";

        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(key)) {
                found = true;
                break;
            }
        }

        System.out.println("Bogie Found: " + found);
    }
}