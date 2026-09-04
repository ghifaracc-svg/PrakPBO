public class Laptop extends ElectronicDevice {

    String processor;
    int ram;

    public void work(){
        System.out.println("Laptop is used for working");
    }

    public void charging(){
        System.out.println("Laptop is charging");
    }

    public void showLaptopInfo(){
        showInfo();
        System.out.println("Processor : " + processor);
        System.out.println("RAM : " + ram + " GB");
    }
}