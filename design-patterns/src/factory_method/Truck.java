package factory_method;

public class Truck implements Transport {
    @Override
    public String deliver() {
        return "Deliver by land in a box";
    }
}
