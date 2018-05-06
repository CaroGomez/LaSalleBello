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
public class EstudianteDTO {
    
    private String nombreEstudiante;
    private String apellidoEstudiante;
    private String idEstudiante;
    private String correoEstudiante;
    private String contraseñaEstudiante;
    private String idCurso;

    public EstudianteDTO(String nombreEstudiante, String apellidoEstudiante, String idEstudiante, String correoEstudiante, String contraseñaEstudiante, String idCurso) {
        this.nombreEstudiante = nombreEstudiante;
        this.apellidoEstudiante = apellidoEstudiante;
        this.idEstudiante = idEstudiante;
        this.correoEstudiante = correoEstudiante;
        this.contraseñaEstudiante = contraseñaEstudiante;
        this.idCurso = idCurso;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getApellidoEstudiante() {
        return apellidoEstudiante;
    }

    public void setApellidoEstudiante(String apellidoEstudiante) {
        this.apellidoEstudiante = apellidoEstudiante;
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getCorreoEstudiante() {
        return correoEstudiante;
    }

    public void setCorreoEstudiante(String correoEstudiante) {
        this.correoEstudiante = correoEstudiante;
    }

    public String getContraseñaEstudiante() {
        return contraseñaEstudiante;
    }

    public void setContraseñaEstudiante(String contraseñaEstudiante) {
        this.contraseñaEstudiante = contraseñaEstudiante;
    }

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }

    @Override
    public String toString() {
        return "EstudianteDTO{" + "nombreEstudiante=" + nombreEstudiante + ", apellidoEstudiante=" + apellidoEstudiante + ", idEstudiante=" + idEstudiante + ", correoEstudiante=" + correoEstudiante + ", contrase\u00f1aEstudiante=" + contraseñaEstudiante + ", idCurso=" + idCurso + '}';
    }
    
    
}
