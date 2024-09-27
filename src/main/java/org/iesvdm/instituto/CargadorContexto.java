package org.iesvdm.instituto;

import org.iesvdm.anotacion.Estudiante;

import java.lang.annotation.Annotation;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CargadorContexto {

    public static List<Clase> cargaContextoInstituto() {

        Estudiante[] estudiantesAnnotation = Clase.class.getAnnotationsByType(Estudiante.class);

        Map<Integer, Clase> integerClaseMap = new HashMap<>();


        for (Estudiante estudianteAnnotation : estudiantesAnnotation) {

            System.out.println(estudianteAnnotation);

            int curso = estudianteAnnotation.curso();
            Clase claseBuscada = integerClaseMap.get(curso);

            if (claseBuscada == null) {
                //Clase no existe en el mapa, luego la creo
                claseBuscada = new Clase(curso);
                integerClaseMap.put(curso, claseBuscada);

            }

            claseBuscada.getEstudiantes().add(new org.iesvdm.instituto.Estudiante(
                    estudianteAnnotation.nombre(),
                    LocalDate.now(),
                    100,
                    estudianteAnnotation.direccion()
            ));

        }

        return new ArrayList<>(integerClaseMap.values());
    }

}
