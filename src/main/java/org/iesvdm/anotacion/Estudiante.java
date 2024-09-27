package org.iesvdm.anotacion;


import java.lang.annotation.*;
import java.util.Date;
//Meta-anotaciones!!
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(Estudiantes.class)
@Documented
public @interface Estudiante {

    String nombre();
    String fechaNacimiento();
    int curso();
    String direccion() default "";
}
