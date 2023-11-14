package factory_method;

public abstract class Logistics {
    public Transport planDelivery(){
        return createTransport();
    }

    protected abstract Transport createTransport();
}
