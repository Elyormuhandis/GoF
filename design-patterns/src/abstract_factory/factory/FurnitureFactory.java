package abstract_factory.factory;

import abstract_factory.products.chair.Chair;
import abstract_factory.products.coffe_table.CoffeTable;
import abstract_factory.products.sofa.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    CoffeTable createCoffeTable();
}
