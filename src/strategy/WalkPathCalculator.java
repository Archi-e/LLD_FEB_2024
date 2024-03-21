package strategy;

import java.nio.file.Path;

public class WalkPathCalculator implements PathCalculator {
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Path via walking mode from "+source+" to "+destination);
    }
}
