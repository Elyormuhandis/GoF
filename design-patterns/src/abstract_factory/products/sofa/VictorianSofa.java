package abstract_factory.products.sofa;

public class VictorianSofa implements Sofa{
    @Override
    public String hasLegs() {
        return "4 legs";
    }

    @Override
    public String legOn() {
        return "You are leg on Victorian Sofa";
    }
}
