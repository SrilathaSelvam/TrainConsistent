import java.util.*;

public class TrainConsistent {

    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== UC12: Safety Compliance ===");

        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Box", "Grain"));

        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        (!b.type.equals("Cylindrical")) ||
                                b.cargo.equals("Petroleum")
                );

        System.out.println("Train Safety Status: " + isSafe);
    }
}