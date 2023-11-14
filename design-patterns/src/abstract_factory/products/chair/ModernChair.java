package abstract_factory.products.chair;

public class ModernChair implements Chair{
    @Override
    public String hasLegs() {
        return "No legs";
    }

    @Override
    public String sitOn() {
        return "You are sitting on the modern chair";
    }
}
