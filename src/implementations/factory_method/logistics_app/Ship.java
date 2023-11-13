package implementations.factory_method.logistics_app;

public class Ship implements Transport{
    @Override
    public String deliver() {
        return "Deliver by sea in a container";
    }
}
