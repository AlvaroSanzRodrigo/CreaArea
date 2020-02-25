package parte1;

public class AreaStrategyTest {
    public static void main(String[] args) {
        ContextAreaStrategy contextAreaStrategyForCircle = new ContextAreaStrategy(new CircleArea());
        ContextAreaStrategy contextAreaStrategyForSquare = new ContextAreaStrategy(new SquareArea());

        System.out.println("We create an instance of parte1.ContextAreaStrategy for every type of strategy");
        System.out.println(contextAreaStrategyForCircle.getArea(5.));
        System.out.println(contextAreaStrategyForSquare.getArea(5.));

        System.out.println("Now we create an unique instance of parte1.ContextAreaStrategy and inject the strategy");

        ContextAreaStrategy contextAreaStrategy = new ContextAreaStrategy();
        contextAreaStrategy.setAreaStrategy(new CircleArea());
        System.out.println(contextAreaStrategy.getArea(4.));
        contextAreaStrategy.setAreaStrategy(new SquareArea());
        System.out.println(contextAreaStrategy.getArea(4.));

    }
}
