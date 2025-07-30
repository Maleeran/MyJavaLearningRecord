package src.day03_controlflow;

public class PracticeDay03{
    public static void main(String[] args) {
        Practice1.run();
    }
}

class Practice1{
    public static void run(){
        int Weight = 75;
        double Height = 1.82;

        double BMI = Weight/Math.pow(Height, 2);
        if (BMI < 18.5){
            System.out.println("过轻");
        } else if (BMI >= 18.5 && BMI < 25) {
            System.out.println("正常");
        } else if (BMI >= 25 && BMI < 28) {
            System.out.println("过重");
        } else if (BMI >= 28 && BMI < 32) {
            System.out.println("肥胖");
        } else {
            System.out.println("非常肥胖");
        }


    }
}
