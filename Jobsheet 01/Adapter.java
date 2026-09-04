public class Adapter {

    int voltage;
    String model;

    public void charge(){
        System.out.println("Adapter is charging device");
    }

    public void connect(){
        System.out.println("Adapter connected");
    }

    public void showInfo(){
        System.out.println("Voltage : " + voltage + " V");
        System.out.println("Model : " + model);
    }
}