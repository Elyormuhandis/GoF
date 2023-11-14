package abstract_factory.products.sofa;

public class ArtDecoSofa implements Sofa{
    @Override
    public String hasLegs() {
        return "4 legs";
    }

    @Override
    public String legOn() {
        return "You are leg on Art Deco Sofa";
    }
}
