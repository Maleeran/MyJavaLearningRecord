package src.day13_Inheritance_ObjectClass;

public class ObjectMethodDemo {
    public static void main(String[] args) {
        Student student1 = new Student("Tom", 23,"2024103004");
        Student student2 = new Student("Jerry", 24,"2024103005");
        Student student3 = new Student("Jerry", 24,"2024103005");

        student1.introduce();
        student2.introduce();

        System.out.println("name: "+ student1.name);
        System.out.println("age: "+ student1.age);

        System.out.println("toString: "+ student1.toString());
        System.out.println("equals: "+ student2.equals(student3));
        System.out.println("hashCode: "+ student2.hashCode());
        System.out.println("hashCode: "+ student3.hashCode());
    }
}
