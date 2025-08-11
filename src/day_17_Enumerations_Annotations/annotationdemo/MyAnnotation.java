package src.day_17_Enumerations_Annotations.annotationdemo;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)// 注解在运行时依然可见
@Target(ElementType.METHOD) // 作用在方法上
@interface MyAnnotation {
    String author();
    String date();
}

class Demo{
    @MyAnnotation(author = "Maleeran", date = "2025-08-11")
    public void testMethod(){
        System.out.println("This is a test method with custom annotation.");
    }
}
