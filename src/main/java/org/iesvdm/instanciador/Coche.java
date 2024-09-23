package org.iesvdm.instanciador;

import org.iesvdm.anotacion.Instanciador;

import java.time.LocalDate;

@Instanciador
public class Coche {
    private LocalDate fechaMatriculacion;
    private String matricula;
    private String numBastidor;
}
