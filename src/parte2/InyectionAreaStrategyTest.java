package parte2;

import parte1.AreaStrategy;
import parte1.CircleArea;
import parte1.ContextAreaStrategy;

import java.util.ArrayList;
import java.util.List;

public class InyectionAreaStrategyTest {
    public static void main(String[] args) {
        InyectionContextAreaStrategy inyectionContextAreaStrategy = new InyectionContextAreaStrategy();
        List<GeometricArea> geometricAreas = new ArrayList<GeometricArea>();
        AreaStrategy circleAreaStrategy = new CircleArea();
        inyectionContextAreaStrategy.setAreaStrategy(circleAreaStrategy);
        for (int i = 0; i < 10; i++) {
            Circle circle = new Circle();
            circle.setRadius(Math.random());
            ContextAreaStrategy contexAreaStrategy = new ContextAreaStrategy(new CircleArea());
            circle.setArea(contexAreaStrategy.getArea(circle.getRadius()));
            geometricAreas.add(circle);
        }
    }
}
