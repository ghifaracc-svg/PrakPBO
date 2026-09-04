public class PowerStrip {

    int socketNumber;
    String brand;

    public void supplyPower(){
        System.out.println("Power strip supplies electricity");
    }

    public void plugIn(){
        System.out.println("Device plugged in");
    }

    public void showInfo(){
        System.out.println("Brand : " + brand);
        System.out.println("Socket : " + socketNumber);
    }
}