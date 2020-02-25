package parte2;

import parte1.CircleArea;
import parte1.ContextAreaStrategy;

public class Circle implements GeometricArea {

    private Double radius;
    private Double area;

    public Circle() {
    }

    public Circle(Double radius, Double area) {
        this.radius = radius;
        this.area = area;
    }

    @Override
    public Double getArea() {
        return null;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area +
                '}';
    }

    public static void main(String[] args) {
        Circle circleExample = new Circle();
        circleExample.setRadius(2.);
        ContextAreaStrategy contexAreaStrategy = new ContextAreaStrategy(new CircleArea());
        circleExample.setArea(contexAreaStrategy.getArea(circleExample.getRadius()));
        System.out.println(circleExample);
    }
}
