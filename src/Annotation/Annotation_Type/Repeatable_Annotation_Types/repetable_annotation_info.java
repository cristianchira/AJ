package Annotation.Annotation_Type.Repeatable_Annotation_Types;

/*                                        Repeating Annotations


    There are some situations where you want to apply the same annotation to a declaration or type use. As of the Java
        SE 8 release, repeating annotations enable you to do this.

        For example, you are writing code to use a timer service that enables you to run a method at a given time or on a
            certain schedule, similar to the UNIX cron service. Now you want to set a timer to run a method, doPeriodicCleanup,
            in the last day of the month and on every Friday at 11:00 p.m. To set the timer to run, create an @Schedule
            annotation and apply it twice to the doPeriodicCleanup method. The first use specifies the last day of the
            month and the second specifies Friday at 11p.m., as shown in the following code example:

                @Schedule(dayOfMonth="last")
                @Schedule(dayOfWeek="Fri", hour="23")
                public void doPeriodicCleanup() { ... }

                The previous example applies an annotation to a method. You can repeat an annotation anywhere that you
                would use a standard annotation. For example, you have a class for handling unauthorized access exceptions.
                You annotate the class with one @Alert annotation for managers and another for admins:

                @Alert(role="Manager")
                @Alert(role="Administrator")
                public class UnauthorizedAccessException extends SecurityException { ... }

        For compatibility reasons, repeating annotations are stored in a container annotation that is automatically generated
            by the Java compiler. In order for the compiler to do this, two declarations are required in your code.

    Step 1: Declare a Repeatable Annotation Type

        The annotation type must be marked with the @Repeatable meta-annotation. The following example defines a custom
            @Schedule repeatable annotation type:

        import java.lang.annotation.Repeatable;

            @Repeatable(Schedules.class)
            public @interface Schedule {
            String dayOfMonth() default "first";
            String dayOfWeek() default "Mon";
            int hour() default 12;
            }

        The value of the @Repeatable meta-annotation, in parentheses, is the type of the container annotation that the Java
            compiler generates to store repeating annotations. In this example, the containing annotation type is Schedules,
            so repeating @Schedule annotations is stored in an @Schedules annotation.

        Applying the same annotation to a declaration without first declaring it to be repeatable results in a compile-time error.

    Step 2: Declare the Containing Annotation Type

        The containing annotation type must have a value element with an array type. The component type of the array type must
            be the repeatable annotation type. The declaration for the Schedules containing annotation type is the following:

            public @interface Schedules {
            Schedule[] value();
            }

   Retrieving Annotations

        There are several methods available in the Reflection API that can be used to retrieve annotations. The behavior
        of the methods that return a single annotation, such as AnnotatedElement.getAnnotation(Class<T>), are unchanged
        in that they only return a single annotation if one annotation of the requested type is present. If more than
        one annotation of the requested type is present, you can obtain them by first getting their container annotation.
        In this way, legacy code continues to work. Other methods were introduced in Java SE 8 that scan through the
        container annotation to return multiple annotations at once, such as AnnotatedElement.getAnnotationsByType(Class<T>).
        See the AnnotatedElement class specification for information on all of the available methods.

   Design Considerations

       When designing an annotation type, you must consider the cardinality of annotations of that type. It is now possible
           to use an annotation zero times, once, or, if the annotation's type is marked as @Repeatable, more than once.
       It is also possible to restrict where an annotation type can be used by using the @Target meta-annotation.
           For example, you can create a repeatable annotation type that can only be used on methods and fields.
       It is important to design your annotation type carefully to ensure that the programmer using the annotation
           finds it to be as flexible and powerful as possible.



 */