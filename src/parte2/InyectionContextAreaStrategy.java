package parte2;

import parte1.AreaStrategy;

import java.util.Comparator;
import java.util.List;

public class InyectionContextAreaStrategy {
    private List<GeometricArea> geometricAreaList;
    private AreaStrategy areaStrategy;

    public AreaStrategy getAreaStrategy() {
        return areaStrategy;
    }

    public void setAreaStrategy(AreaStrategy areaStrategy) {
        this.areaStrategy = areaStrategy;
    }

    public InyectionContextAreaStrategy(List<GeometricArea> geometricAreaList) {
        this.geometricAreaList = geometricAreaList;
    }

    public InyectionContextAreaStrategy() {
    }

    public List<GeometricArea> getGeometricAreaList() {
        return geometricAreaList;
    }

    public void setGeometricAreaList(List<GeometricArea> geometricAreaList) {
        this.geometricAreaList = geometricAreaList;
    }

    public void sort(Comparator<GeometricArea> comparator){
        this.geometricAreaList.sort(comparator);
    }
}
