import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistent {
    public static void main(String[] args) {

        System.out.println("=== UC13: Performance Comparison ===");

        List<Integer> data = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            data.add(i);
        }

        // Loop timing
        long start1 = System.nanoTime();
        List<Integer> result1 = new ArrayList<>();
        for (int i : data) {
            if (i > 50000) {
                result1.add(i);
            }
        }
        long end1 = System.nanoTime();

        // Stream timing
        long start2 = System.nanoTime();
        List<Integer> result2 = data.stream()
                .filter(i -> i > 50000)
                .collect(Collectors.toList());
        long end2 = System.nanoTime();

        System.out.println("Loop Time: " + (end1 - start1));
        System.out.println("Stream Time: " + (end2 - start2));
    }
}