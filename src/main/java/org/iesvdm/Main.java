package org.iesvdm;

import org.iesvdm.descriptor.PruebaDescripcion;

import java.lang.annotation.Annotation;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Annotation[] annotations = PruebaDescripcion.class.getAnnotations();

        System.out.println(Arrays.toString(annotations));

    }
}