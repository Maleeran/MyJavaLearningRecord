package src.day_17_Enumerations_Annotations.enumdemo;

// 枚举定义与使用
enum WeekDay {
    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),
    THURSDAY("星期四"),FRIDAY("星期五"),SATURDAY("星期六"),SUNDAY("星期日");

    private final String chineseName;

    WeekDay(String chineseName) {
        this.chineseName = chineseName;
    }

    public String getChineseName() {
        return chineseName;
    }
}
