package parte2;

import java.util.Comparator;

public class DescAreaComparator implements Comparator<GeometricArea> {
    @Override
    public int compare(GeometricArea o1, GeometricArea o2) {
        return o2.getArea().compareTo(o1.getArea());
    }
}
