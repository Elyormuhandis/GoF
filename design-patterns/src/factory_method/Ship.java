package factory_method;

public class Ship implements Transport{
    @Override
    public String deliver() {
        return "Deliver by sea in a container";
    }
}
