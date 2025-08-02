package src.day08_commandline_oop.corefeatures;

// 封装（Encapsulation）
public class Student {
    private String name;
    private int age;
    private double score;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getName(){
        return name;
    }

    public void study(){
        System.out.println(name + "正在学习！");
    }
    public void introduce(){
        System.out.println("大家好，我是"+name+",今年"+age+"岁。我在上一次考试中考了"+score);
    }
}

class Teacher extends src.day08_commandline_oop.corefeatures.Student {
    String subject;

    void teach(){
        System.out.println(getName() + "正在讲授" + subject);
    }
}

