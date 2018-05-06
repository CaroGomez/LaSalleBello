/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lasalle.gestionacademica.modelo.dto;

/**
 *
 * @author Carolina
 */
public class AcudienteDTO {
    
    private String nombreAcudiente;
    private String apellidoAcudiente;
    private String idAcudiente;
    private String correoAcudiente;
    private String contraseñaAcudiente;
    private String idEstudiante;

    public AcudienteDTO(String nombreAcudiente, String apellidoAcudiente, String idAcudiente, String correoAcudiente, String contraseñaAcudiente, String idEstudiante) {
        this.nombreAcudiente = nombreAcudiente;
        this.apellidoAcudiente = apellidoAcudiente;
        this.idAcudiente = idAcudiente;
        this.correoAcudiente = correoAcudiente;
        this.contraseñaAcudiente = contraseñaAcudiente;
        this.idEstudiante = idEstudiante;
    }

    public String getNombreAcudiente() {
        return nombreAcudiente;
    }

    public void setNombreAcudiente(String nombreAcudiente) {
        this.nombreAcudiente = nombreAcudiente;
    }

    public String getApellidoAcudiente() {
        return apellidoAcudiente;
    }

    public void setApellidoAcudiente(String apellidoAcudiente) {
        this.apellidoAcudiente = apellidoAcudiente;
    }

    public String getIdAcudiente() {
        return idAcudiente;
    }

    public void setIdAcudiente(String idAcudiente) {
        this.idAcudiente = idAcudiente;
    }

    public String getCorreoAcudiente() {
        return correoAcudiente;
    }

    public void setCorreoAcudiente(String correoAcudiente) {
        this.correoAcudiente = correoAcudiente;
    }

    public String getContraseñaAcudiente() {
        return contraseñaAcudiente;
    }

    public void setContraseñaAcudiente(String contraseñaAcudiente) {
        this.contraseñaAcudiente = contraseñaAcudiente;
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    @Override
    public String toString() {
        return "AcudienteDTO{" + "nombreAcudiente=" + nombreAcudiente + ", apellidoAcudiente=" + apellidoAcudiente + ", idAcudiente=" + idAcudiente + ", correoAcudiente=" + correoAcudiente + ", contrase\u00f1aAcudiente=" + contraseñaAcudiente + ", idEstudiante=" + idEstudiante + '}';
    }


}
