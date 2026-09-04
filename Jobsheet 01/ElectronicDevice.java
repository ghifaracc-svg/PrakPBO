public class ElectronicDevice {

    String brand;
    int power;

    public void turnOn(){
        System.out.println("Device is turned on");
    }

    public void turnOff(){
        System.out.println("Device is turned off");
    }

    public void showInfo(){
        System.out.println("Brand : " + brand);
        System.out.println("Power : " + power + " Watt");
    }
}