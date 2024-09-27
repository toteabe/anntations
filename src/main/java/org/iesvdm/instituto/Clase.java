package org.iesvdm.instituto;

import org.iesvdm.anotacion.Estudiante;
import org.iesvdm.anotacion.Estudiantes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Estudiante(
        nombre = "Jose",
        fechaNacimiento = "01/01/2001",
        curso = 2
)
@Estudiante(
        nombre = "Fran",
        fechaNacimiento = "02/02/2002",
        curso = 1
)
//@Estudiantes({
//        @Estudiante(nombre = "jose", fechaNacimiento = "01/01/2001",curso=2),
//        @Estudiante(nombre = "fran", fechaNacimiento = "02/02/2002",curso=1)
//        })
public class Clase {

    private int curso;
    private List<org.iesvdm.instituto.Estudiante> estudiantes = new ArrayList<>();

    public Clase() {
    }

    public Clase(int curso) {
        this.curso = curso;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }


    public List<org.iesvdm.instituto.Estudiante> getEstudiantes() {
        return estudiantes;
    }



    @Override
    public String toString() {
        return "Clase{" +
                "curso='" + curso + '\'' +

                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clase clase = (Clase) o;
        return Objects.equals(curso, clase.curso) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(curso);
    }
}
