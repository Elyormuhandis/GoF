package abstract_factory;

import abstract_factory.products.chair.Chair;
import abstract_factory.factory.FurnitureFactory;

public class Client {
    private final FurnitureFactory factory;

    public Client(FurnitureFactory factory) {
        this.factory = factory;
    }

    public void sitOnChair(){
        Chair chair = factory.createChair();
        System.out.println(chair.sitOn());
    }
}
