public class TrainConsistent {
    public static void main(String[] args) {

        System.out.println("=== UC16: Bubble Sort ===");

        int[] capacities = {72, 40, 60, 20};

        // Bubble Sort
        for (int i = 0; i < capacities.length - 1; i++) {
            for (int j = 0; j < capacities.length - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        for (int c : capacities) {
            System.out.print(c + " ");
        }
    }
}