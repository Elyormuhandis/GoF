package abstract_factory;

import abstract_factory.factory.FurnitureFactory;
import abstract_factory.factory.ModernFurnitureFactory;

public class Main {

    public static void main(String[] args) {
        FurnitureFactory factory = new ModernFurnitureFactory();
        Client client = new Client(factory);
        client.sitOnChair();
    }
}
