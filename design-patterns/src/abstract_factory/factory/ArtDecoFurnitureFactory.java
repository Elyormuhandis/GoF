package abstract_factory.factory;

import abstract_factory.products.chair.ArtDecoChair;
import abstract_factory.products.chair.Chair;
import abstract_factory.products.coffe_table.ArtDecoCoffeeTable;
import abstract_factory.products.coffe_table.CoffeTable;
import abstract_factory.products.sofa.ArtDecoSofa;
import abstract_factory.products.sofa.Sofa;

public class ArtDecoFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public CoffeTable createCoffeTable() {
        return new ArtDecoCoffeeTable();
    }
}
