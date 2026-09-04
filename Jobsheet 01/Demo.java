public class Demo {

    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        laptop.brand = "ASUS";
        laptop.power = 180;
        laptop.processor = "Intel Core i5";
        laptop.ram = 8;

        laptop.showLaptopInfo();
        laptop.turnOn();
        laptop.work();


        Mouse mouse = new Mouse();
        mouse.brand = "Targus";
        mouse.power = 5;
        mouse.type = "Optical Mouse";
        mouse.connection = "USB";

        mouse.showMouseInfo();
        mouse.click();


        Adapter adapter = new Adapter();
        adapter.voltage = 19;
        adapter.model = "ASUS Adapter";

        adapter.showInfo();
        adapter.charge();


        PowerStrip power = new PowerStrip();
        power.brand = "Vivan";
        power.socketNumber = 5;

        power.showInfo();
        power.supplyPower();

    }
}