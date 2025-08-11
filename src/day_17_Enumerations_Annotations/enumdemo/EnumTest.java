package src.day_17_Enumerations_Annotations.enumdemo;

public class EnumTest {
    public static void main(String[] args) {
        WeekDay day = WeekDay.THURSDAY;
        switch(day){
            case MONDAY:
                System.out.println("今天是" + day.getChineseName() + "，努力工作！");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("今天是" + day.getChineseName() + "，周末快乐！");
                break;
            default:
                System.out.println("今天是" + day.getChineseName() + "，加油！");
        }
    }
}
