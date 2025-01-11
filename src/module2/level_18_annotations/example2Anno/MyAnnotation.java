package module2.level_18_annotations.example2Anno;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // Работает в Runtime
@Target({ElementType.TYPE}) // Может устанавливаться только над классом
@Inherited
public @interface MyAnnotation {
}
