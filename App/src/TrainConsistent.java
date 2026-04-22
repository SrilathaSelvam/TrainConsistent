import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistent {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public String toString() {
            return name + "(" + capacity + ")";
        }
    }

    public static void main(String[] args) {

        System.out.println("=== UC9: Group Bogies ===");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("Sleeper", 60));
        bogies.add(new Bogie("AC Chair", 40));

        Map<String, List<Bogie>> grouped =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        System.out.println("Grouped Bogies: " + grouped);
    }
}