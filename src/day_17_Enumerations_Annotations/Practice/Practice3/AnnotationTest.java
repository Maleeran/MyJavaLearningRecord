package src.day_17_Enumerations_Annotations.Practice.Practice3;

import java.lang.reflect.Method;

public class AnnotationTest {
    public static void main(String[] args) {
        Class<?> clazz = MyClass.class;

        // 获取类中的所有方法
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            // 检查方法上是否有Version注解
            if (method.isAnnotationPresent(Version.class)){
                Version version = method.getAnnotation(Version.class);

                System.out.println("Method: " + method.getName());
                System.out.println("Version number: " + version.number());
                System.out.println("Version date: " + version.date());
                System.out.println("------------------------------");
            }
        }

        // 也可以直接获取特定方法上的注解
        try{
            Method processData = clazz.getDeclaredMethod("processData");
            if (processData.isAnnotationPresent(Version.class)) {
                Version version = processData.getAnnotation(Version.class);
                System.out.println("Method: " + processData.getName());
                System.out.println("Version number: " + version.number());
                System.out.println("Version date: " + version.date());
                System.out.println("------------------------------");
            }
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }
    }

}
