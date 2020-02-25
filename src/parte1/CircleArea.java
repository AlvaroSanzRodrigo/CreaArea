package parte1;

public class CircleArea implements AreaStrategy {

    @Override
    public Double getArea(Double number) {
        return Math.PI * Math.pow(number, 2);
    }
}
