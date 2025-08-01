package src.day08_commandline_oop.corefeatures;

class Teacher extends src.day08_commandline_oop.corefeatures.Student {
    String subject;

    void teach(){
        System.out.println(getName() + "正在讲授" + subject);
    }
}
