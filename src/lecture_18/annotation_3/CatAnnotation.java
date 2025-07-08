package lecture_18.annotation_3;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
@Documented
public @interface CatAnnotation {
    String value();
}
