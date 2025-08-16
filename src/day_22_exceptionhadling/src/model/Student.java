package src.day_22_exceptionhadling.src.model;

public class Student {
    private String id;
    private String name;
    private double score;

    /**
     * 构造函数，用于创建Student对象
     * @param id 学生的唯一标识符
     * @param name 学生的姓名
     * @param score 学生的成绩
     */
    public Student(String id , String name , double score){
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getScore(){
        return score;
    }

    @Override
    public String toString(){
        return "Student [id = " + id + " , name = " + name + " , score = " + score + "]";
    }
}
