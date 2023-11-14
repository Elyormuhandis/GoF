package abstract_factory.products.chair;

public class VictorianChair implements Chair{
    @Override
    public String hasLegs() {
        return "4 legs";
    }

    @Override
    public String sitOn() {
        return "You are sitting on the victorian chair";
    }
}
