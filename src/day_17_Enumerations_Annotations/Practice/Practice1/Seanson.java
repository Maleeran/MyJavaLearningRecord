package src.day_17_Enumerations_Annotations.Practice.Practice1;

enum Season {
    SPRING("15°C~25°C", "踏青"), SUMMER("30°C~35°C", "游泳"),
    FALL("10°C~15°C", "赏枫"), WINTER("-10°C~10°C", "滑雪");

    private final String temperature;
    private final String activity;

    Season(String temperature, String activity) {
        this.temperature = temperature;
        this.activity = activity;
    }

    public String getTemperature() {
        return temperature;
    }

    public String printActivity(){
        return activity;
    }
    public static void main(String[] args) {
        Season s[] = {SPRING, SUMMER, FALL, WINTER};
        for (Season si : s)
            System.out.println(si + ": " + si.getTemperature());

        Season season = Season.SUMMER;
        switch (season){
            case SPRING:
                System.out.println("现在是春天，该去"+season.printActivity()+"了。");
                break;
            case SUMMER:
                System.out.println("现在是夏天，该去"+season.printActivity()+"了。");
                break;
            case FALL:
                System.out.println("现在是秋天，该去"+season.printActivity()+"了。");
                break;
            case WINTER:
                System.out.println("现在是冬天，该去"+season.printActivity()+"了。");
                break;
        }
    }


}

