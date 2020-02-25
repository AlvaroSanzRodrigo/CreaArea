package parte1;

public class SquareArea implements AreaStrategy {

    @Override
    public Double getArea(Double number) {
       return Math.pow(number, 2);
    }
}
