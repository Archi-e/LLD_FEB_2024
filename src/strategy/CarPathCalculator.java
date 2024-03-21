package strategy;

public class CarPathCalculator implements PathCalculator{

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Path using CAR from "+source+" to "+destination);
    }
}
