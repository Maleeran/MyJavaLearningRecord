package src.day_25_scannerclass.src.model;

public class Student {
    private String id;
    private String name;
    private double score;

    public Student (String id, String name, double score){
        this.id = id;
        this.name = name ;
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
    public void setScore(double score){
        this.score = score;
    }

    @Override
    public String toString(){
        return"Student{Id=' " + id + "', name=' " + name +"', score=" + score + "}";
    }
}
