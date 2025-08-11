package src.day_17_Enumerations_Annotations.Practice.Homework;

public class Task {
    private String name;
    private TaskStatus status;

    public Task(String name, TaskStatus status) {
        this.name = name;
        this.status = status;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public void printTasks(){
        System.out.println("任务名称：" + name + "，任务状态：" + status.getDescription());
    }

}
