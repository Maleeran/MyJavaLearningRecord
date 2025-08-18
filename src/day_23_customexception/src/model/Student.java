package src.day_23_customexception.src.model;

public class Student {
    private String Id;
    private String name;
    private double score;

    public Student(String Id, String name, double score) {
        this.Id = Id;
        this.name = name;
        this.score = score;
    }

    public String getId(){
        return Id;
    }
    public String getName(){
        return name;
    }
    public double getScore(){
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id='" + Id + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
