package src.day03_controlflow;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        int day = 4;

        switch (day) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            default:
                System.out.println("未知星期");
        }
    }
}

class Fruitchoice {
    public static void main(String[] args) {
        String fruit = "mango";
        int opt = switch (fruit) {
            case "apple" -> {
                System.out.println("Selected apple.");
                yield 1;
            }
            case "pear", "mango" -> {
                System.out.println("Selected pear or mango.");
                System.out.println("Nice try!!");
                yield 2;
            }
            default -> {
                System.out.println("No fruit selected.");
                System.out.println("Please add " + fruit + " in options. QAQ");
                yield 0;
            }
        };
        System.out.println("opt = " + opt);
    }
}


