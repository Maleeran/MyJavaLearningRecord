package src.day08_commandline_oop.corefeatures;

public class Teacherlist {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();
        Teacher teacher3 = new Teacher();
        Teacher teacher4 = new Teacher();

        teacher1.setName(" Ryan ");
        teacher1.subject = " Math ";
        teacher2.setName(" Lisa ");
        teacher2.subject = " English ";
        teacher3.setName(" Vicent ");
        teacher3.subject = " Java ";

        teacher1.teach();
        teacher2.teach();
        teacher3.teach();

    }
}