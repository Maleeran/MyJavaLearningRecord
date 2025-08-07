package src.day14_AbstractandInterface.Practice;

public class Computer {
    protected String name;

    public Computer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void connectDevice(USB usb) {
        System.out.println(usb.getName() + " is connecting to " + this.name + "...");
    }

}
