package 注解;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author wy
 * @version 1.0
 */
@Target({ElementType.METHOD,ElementType.TYPE,ElementType.FIELD,ElementType.CONSTRUCTOR,ElementType.ANNOTATION_TYPE,ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Book {
    String name();
    String[] author() ;
    double price() default 100.0;

}
