package abstract_factory.products.sofa;

public class ModernSofa implements Sofa{
    @Override
    public String hasLegs() {
        return "No legs";
    }

    @Override
    public String legOn() {
        return "You are leg on Modern Sofa";
    }
}
