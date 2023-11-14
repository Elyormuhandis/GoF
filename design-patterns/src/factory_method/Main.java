package factory_method;

public class Main {
    private static Logistics logistics;
    public static void main(String[] args) {
        createLogistics("sea");
        deliver();
    }

    private static void createLogistics(String logisticsType){
        switch (logisticsType) {
            case "sea" -> logistics = new SeaLogistics();
            case "land" -> logistics = new RoadLogistics();
            default -> logistics = null;
        }
    }

    private static void deliver(){
        Transport transport = logistics.planDelivery();
        System.out.println(transport.deliver());
    }
}
