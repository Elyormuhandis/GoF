package implementations.factory_method.logistics_app;

public class RoadLogistics extends Logistics{
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
