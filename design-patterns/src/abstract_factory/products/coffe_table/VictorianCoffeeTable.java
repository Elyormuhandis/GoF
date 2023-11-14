package abstract_factory.products.coffe_table;

public class VictorianCoffeeTable implements CoffeTable{
    @Override
    public String hasLegs() {
        return "4 legs";
    }

    @Override
    public String putOn() {
        return "You are put thing on the victorian coffee table";
    }
}
