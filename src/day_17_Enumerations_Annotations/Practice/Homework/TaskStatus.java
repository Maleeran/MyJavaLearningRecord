package src.day_17_Enumerations_Annotations.Practice.Homework;

public enum TaskStatus {
    TODO("待处理"),
    IN_PROGRESS("进行中"),
    COMPLETED("已完成"),
    CANCELED("已取消");

    private final String description;

    TaskStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
