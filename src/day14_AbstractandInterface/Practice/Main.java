package src.day14_AbstractandInterface.Practice;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer("MacBook");
        computer1.connectDevice(new Mouse("Apple Mouse"));
        computer1.connectDevice(new Keyboard("Apple Keyboard"));

        Computer computer2 = new Computer("RogBook");
        computer2.connectDevice(new Mouse("Logitech Mouse"));
        computer2.connectDevice(new Keyboard("Logitech Keyboard"));

        System.out.println("Connected successfully!");
    }

}

