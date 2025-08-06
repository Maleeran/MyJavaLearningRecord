package src.day13_Inheritance_ObjectClass;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void introduce() {
        System.out.println("Hi everyone,my name is " + name+ "."+ "Nice to meet you all!");
        System.out.println("I am " + age + " years old.");
    }
}