package com.lasalle.gestionacademica.modelo.dto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.List;

/**
 *
 * @author Carolina
 */
public class CursoDTO {
    
    private String grado;
    private String idProfesor;
    private List<EstudianteDTO> estudiantes;

    public CursoDTO(String grado, String idProfesor) {
        this.grado = grado;
        this.idProfesor = idProfesor;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    public List<EstudianteDTO> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<EstudianteDTO> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return "CursoDTO{" + "grado=" + grado + ", idProfesor=" + idProfesor + '}';
    }
    
    
}
