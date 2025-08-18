package src.day_24_fileinputoutput.src.model;

public class Student {
    private String name;
    private String id;
    private double score;

    public Student(String name, String id, double score){
        this.name = name;
        this.id = id;
        this.score = score;
    }
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public double getScore(){
        return score;
    }

    public void setScore(double score){
        this.score = score;
    }
    @Override
    public String toString(){
        return name + "," + id + "," + score;
    }
    public static Student fromString(String line){
        String[] parts = line.split(",");
        if(parts.length ==3){
            return new Student(parts[0],parts[1],Double.parseDouble(parts[2]));
        }
        return null;
    }

}

