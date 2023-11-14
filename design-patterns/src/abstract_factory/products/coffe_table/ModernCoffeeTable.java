package abstract_factory.products.coffe_table;

public class ModernCoffeeTable implements CoffeTable {
    @Override
    public String hasLegs() {
        return "4 legs";
    }

    @Override
    public String putOn() {
        return "You are put on things under modern coffee table";
    }
}
