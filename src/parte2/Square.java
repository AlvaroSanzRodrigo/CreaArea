package parte2;

public class Square implements GeometricArea {

    private Double side;
    private Double area;

    public Square() {
    }

    public Square(Double side, Double area) {
        this.side = side;
        this.area = area;
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    @Override
    public Double getArea() {
        return null;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area=" + area +
                '}';
    }
}
