package src.day15_Polymorphism.Polymorphismtest;

public class Main {
    public static void main(String[] args) {
        //向上转型
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.makeSound();  // 动态绑定 -> Dog 的 makeSound()
        a2.makeSound();  // 动态绑定 -> Cat 的 makeSound()

        // a1.fetch(); // 编译错误 (编译器认为 a1 是 Animal 类型)

        // 向下转型
        if(a1 instanceof Dog);
        Dog d1 = (Dog) a1;
        d1.fetch();

        if (a2 instanceof Cat);
        Cat c1 = (Cat) a2;
        c1.sleep();

    }
}
