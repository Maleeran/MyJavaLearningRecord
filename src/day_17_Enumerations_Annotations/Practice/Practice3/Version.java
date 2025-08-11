package src.day_17_Enumerations_Annotations.Practice.Practice3;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Version {
    String number();
    String date();
}
