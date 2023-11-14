package abstract_factory.products.chair;

public class ArtDecoChair implements Chair{
    @Override
    public String hasLegs() {
        return "4 legs";
    }

    @Override
    public String sitOn() {
        return "You are sitting on the art deco chair";
    }
}
