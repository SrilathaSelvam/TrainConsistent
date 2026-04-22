public class TrainConsistent {

    static class CargoSafetyException extends RuntimeException {
        CargoSafetyException(String msg) {
            super(msg);
        }
    }

    static void assignCargo(String shape, String cargo) {
        if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
            throw new CargoSafetyException("Unsafe Cargo Assignment!");
        }
        System.out.println("Cargo assigned successfully.");
    }

    public static void main(String[] args) {

        System.out.println("=== UC15: Safe Cargo Assignment ===");

        try {
            assignCargo("Rectangular", "Petroleum");
        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Operation completed.");
        }
    }
}