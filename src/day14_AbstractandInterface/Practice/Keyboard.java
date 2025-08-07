package src.day14_AbstractandInterface.Practice;

public class Keyboard implements USB {
    protected String name;

    public Keyboard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public void connect() {
        System.out.println("Connecting " + name + " to computer ...");
    }
}
