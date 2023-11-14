package abstract_factory.factory;

import abstract_factory.products.chair.Chair;
import abstract_factory.products.chair.VictorianChair;
import abstract_factory.products.coffe_table.CoffeTable;
import abstract_factory.products.coffe_table.VictorianCoffeeTable;
import abstract_factory.products.sofa.Sofa;
import abstract_factory.products.sofa.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public CoffeTable createCoffeTable() {
        return new VictorianCoffeeTable();
    }
}
