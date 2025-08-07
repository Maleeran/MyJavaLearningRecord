package src.day14_AbstractandInterface.Practice;

public class Mouse implements USB {
    protected String name;

    public Mouse(String name) {
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
