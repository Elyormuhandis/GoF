package implementations.factory_method.logistics_app;

public abstract class Logistics {
    public void planDelivery() {
        Transport transport = createTransport();
        System.out.println("Order delivery mode: \""+transport.deliver()+"\"");
    }
    protected abstract Transport createTransport();
}
