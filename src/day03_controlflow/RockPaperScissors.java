package src.day03_controlflow;
import java.util.Random;
import java.util.Scanner;


public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("欢迎来到石头剪刀布游戏！");
        System.out.println("请选择你的出拳：");
        System.out.println("1 - 石头");
        System.out.println("2 - 剪刀");
        System.out.println("3 - 布");
        System.out.print("请输入你的选择（1, 2 或 3）：");

        int playerChoice = scanner.nextInt();

        if (playerChoice < 1 || playerChoice > 3) {
            System.out.println("无效的输入，请重新运行程序并输入1,2或3.");
            return; //结束程序
        }

        // 电脑随机选择
        int computerChoice = random.nextInt(3) + 1;

        // 显示玩家的选择
        System.out.println("--------------------------");
        System.out.println("你选择了: " + playerChoice);
        System.out.println("电脑选择了：" + computerChoice);
        System.out.println("--------------------------");

        // 判断胜负
        if (playerChoice == computerChoice) {
            System.out.println("平局了。");
        } else {
            switch (playerChoice) {
                case 1: // 选了石头
                    if (computerChoice == 2) { // 电脑选了剪刀
                        System.out.println("你赢了！！石头砸碎剪刀！");
                    } else {
                        System.out.println("你输了。。布包住石头。。");
                    }
                    break;
                case 2: // 选了剪刀
                    if (computerChoice == 3) { // 电脑选了布
                        System.out.println("你赢了！！剪刀剪烂了布！");
                    } else {
                        System.out.println("你输了。。石头砸碎剪刀。。");
                    }
                    break;
                case 3: // 选了布
                    if (computerChoice == 1) { // 电脑选了布
                        System.out.println("你赢了！！布包住石头！");
                    } else {
                        System.out.println("你输了。。剪刀剪烂了布。。");
                    }
                    break;
            }
        }
        scanner.close(); // 关闭 Scanner
    }
}