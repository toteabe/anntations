package org.iesvdm.instituto;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Bienvenido al gestor de instituto");
        System.out.println("Cargando contexto de aplicación...");

        List<Clase> clases = CargadorContexto.cargaContextoInstituto();
        //...

        System.out.println("Clases cargadas:");

        for (Clase clase : clases) {
            System.out.println(clase);
        }


    }

}
