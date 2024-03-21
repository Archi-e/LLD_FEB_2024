package strategy;

public class Maps {
    public void findPath(String source, String destination, Mode mode){
        PathCalculator pc = PathCalculatorFactory.getPathCalculator(mode);
        pc.findPath(source, destination);
    }
}
