package implementations.factory_method;

import implementations.factory_method.logistics_app.Logistics;
import implementations.factory_method.logistics_app.RoadLogistics;
import implementations.factory_method.logistics_app.SeaLogistics;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Logistics> logistics = List.of(new SeaLogistics(), new RoadLogistics());
        logistics.forEach(Logistics::planDelivery);
    }
}
