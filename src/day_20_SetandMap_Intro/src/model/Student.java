package src.day_20_SetandMap_Intro.src.model;

public class Student {
    private String id ;
    private String name;
    private double score;

    public Student(String id, String name, double score){
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
    public void setName(String name){
        this.name = name;
    }
    public double getScore(){
        return score;
    }
    public void setScore(double score){
        this.score = score;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id.equals(student.id);
    }

    @Override
    public int hashCode(){
        return id.hashCode();
    }

    @Override
    public String toString(){
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
}
