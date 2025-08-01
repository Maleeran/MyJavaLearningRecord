package src.day08_commandline_oop.corefeatures;

public class Studentlist {
    public static void main(String[] args){
        Student student1 = new Student();
//        Student student2 = new Student();
//        Student student3 = new Student();

        student1.setName("Alice");
        student1.setAge(24);
        student1.setScore(98.5);

        student1.study();
        student1.introduce();
    }
}
