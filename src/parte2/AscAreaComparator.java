package parte2;

import java.util.Comparator;

public class AscAreaComparator implements Comparator<GeometricArea> {
    @Override
    public int compare(GeometricArea o1, GeometricArea o2) {
        return o1.getArea().compareTo(o2.getArea());
    }
}
