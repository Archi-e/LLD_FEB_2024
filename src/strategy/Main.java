package strategy;

public class Main {
    public static void main(String[] args) {
        Maps map = new Maps();
        map.findPath("Bangalore", "Delhi", Mode.CAR);
    }
}
