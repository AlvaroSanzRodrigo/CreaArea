package parte1;

public class ContextAreaStrategy {
    private AreaStrategy areaStrategy;

    ContextAreaStrategy(){}

    public ContextAreaStrategy(AreaStrategy areaStrategy) {
        this.areaStrategy = areaStrategy;
    }

    public AreaStrategy getAreaStrategy() {
        return areaStrategy;
    }

    public void setAreaStrategy(AreaStrategy areaStrategy) {
        this.areaStrategy = areaStrategy;
    }

    public Double getArea(Double number){
        return areaStrategy.getArea(number);
    }
}
