package abstract_factory.factory;

import abstract_factory.products.chair.Chair;
import abstract_factory.products.chair.ModernChair;
import abstract_factory.products.coffe_table.CoffeTable;
import abstract_factory.products.coffe_table.ModernCoffeeTable;
import abstract_factory.products.sofa.ModernSofa;
import abstract_factory.products.sofa.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeTable createCoffeTable() {
        return new ModernCoffeeTable();
    }
}
