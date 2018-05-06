/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lasalle.gestionacademica.modelo;

/**
 *
 * @author Carolina
 */
public class ProfesorDTO {
    
    private String nombreProfesor;
    private String apellidoProfesor;
    private String idProfesor;
    private String correoProfesor;
    private String contraseñaProfesor;
    private String idCurso;

    public ProfesorDTO(String nombreProfesor, String apellidoProfesor, String idProfesor, String correoProfesor, String contraseñaProfesor, String idCurso) {
        this.nombreProfesor = nombreProfesor;
        this.apellidoProfesor = apellidoProfesor;
        this.idProfesor = idProfesor;
        this.correoProfesor = correoProfesor;
        this.contraseñaProfesor = contraseñaProfesor;
        this.idCurso = idCurso;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public String getApellidoProfesor() {
        return apellidoProfesor;
    }

    public void setApellidoProfesor(String apellidoProfesor) {
        this.apellidoProfesor = apellidoProfesor;
    }

    public String getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getCorreoProfesor() {
        return correoProfesor;
    }

    public void setCorreoProfesor(String correoProfesor) {
        this.correoProfesor = correoProfesor;
    }

    public String getContraseñaProfesor() {
        return contraseñaProfesor;
    }

    public void setContraseñaProfesor(String contraseñaProfesor) {
        this.contraseñaProfesor = contraseñaProfesor;
    }

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }

    @Override
    public String toString() {
        return "ProfesorDTO{" + "nombreProfesor=" + nombreProfesor + ", apellidoProfesor=" + apellidoProfesor + ", idProfesor=" + idProfesor + ", correoProfesor=" + correoProfesor + ", contrase\u00f1aProfesor=" + contraseñaProfesor + ", idCurso=" + idCurso + '}';
    }

    
}
