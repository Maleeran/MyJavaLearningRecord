// Animal.java 示例代码
package src.day14_AbstractandInterface;

public abstract class Animal {
    protected String name;

    public Animal (String name){
        this.name = name;
    }

    public abstract void makeSound();

    public void eat(){
        System.out.println(name + " is eating.");
    }

    public void sleep(){
        System.out.println(name + " is sleeping.");
    }
}