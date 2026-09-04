public class Mouse extends ElectronicDevice {

    String type;
    String connection;

    public void click(){
        System.out.println("Mouse is clicking");
    }

    public void moveCursor(){
        System.out.println("Mouse moves cursor");
    }

    public void showMouseInfo(){
        showInfo();
        System.out.println("Type : " + type);
        System.out.println("Connection : " + connection);
    }
}