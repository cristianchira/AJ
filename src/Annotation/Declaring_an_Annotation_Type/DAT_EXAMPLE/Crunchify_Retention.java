package Annotation.Declaring_an_Annotation_Type.DAT_EXAMPLE;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Crunchify_Retention {
    String returnSomething();
}