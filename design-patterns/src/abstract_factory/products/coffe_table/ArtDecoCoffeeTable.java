package abstract_factory.products.coffe_table;

public class ArtDecoCoffeeTable implements CoffeTable{
    @Override
    public String hasLegs() {
        return "No legs";
    }

    @Override
    public String putOn() {
        return "You are put things on art deco coffee table";
    }
}
