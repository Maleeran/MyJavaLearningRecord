// Dog.java 示例代码
package src.day14_AbstractandInterface;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("The sounds of " + name + " is 'Wang Wang'.");
    }
}