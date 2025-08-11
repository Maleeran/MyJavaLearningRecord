package src.day_17_Enumerations_Annotations.Practice.Practice3;

public class MyClass {
    @Version(number = "1.0.0", date = "2025-08-11")
    public void processData() {
        System.out.println("Processing data... ");
    }

    @Version(number = "1.0.1", date = "2025-08-12")
    public void displayData() {
        System.out.println("Displaying data... ");
    }

    public void printData() {
        System.out.println("Printing data... ");
    }
}
