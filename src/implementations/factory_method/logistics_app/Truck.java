package implementations.factory_method.logistics_app;

public class Truck implements Transport{
    @Override
    public String deliver() {
        return "Deliver by land in a box";
    }
}
