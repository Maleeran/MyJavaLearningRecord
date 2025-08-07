package src.day13_Inheritance_ObjectClass.Practice;
/*
- 创建父类 `Shape`，包含 `String name` 字段和 `getArea()` 方法（可为空或返回0）
- 创建两个子类 `Circle` 和 `Rectangle`，重写 `getArea()` 方法
- 创建 `Animal.java`，定义 `Shape[]` 存储多个形状，遍历输出每个形状的面积和名称
 */

public class Shape {
    protected String name;
    private double area;

    public Shape(String name) {
        this.name = name;
    }

    public Shape(String name, double area){
        this.name = name;
        this.area = area;
    }

    public double getArea(){
        return area;
    }
}
