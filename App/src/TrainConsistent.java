public class TrainConsistent {
    public static void main(String[] args) {

        System.out.println("=== UC19: Binary Search ===");

        String[] bogieIds = {"B1", "B2", "B3", "B4", "B5"};
        String key = "B3";

        int low = 0, high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            int cmp = key.compareTo(bogieIds[mid]);

            if (cmp == 0) {
                found = true;
                break;
            } else if (cmp > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Bogie Found: " + found);
    }
}