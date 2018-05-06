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
public class DirectivoDTO {
    
    private String nombreDirectivo;
    private String apellidoDirectivo;
    private String idDirectivo;
    private String correoDirectivo;
    private String contraseñaDirectivo;
    private String rolDirectivo;

    public DirectivoDTO(String nombreDirectivo, String apellidoDirectivo, String idDirectivo, String correoDirectivo, String contraseñaDirectivo, String rolDirectivo) {
        this.nombreDirectivo = nombreDirectivo;
        this.apellidoDirectivo = apellidoDirectivo;
        this.idDirectivo = idDirectivo;
        this.correoDirectivo = correoDirectivo;
        this.contraseñaDirectivo = contraseñaDirectivo;
        this.rolDirectivo = rolDirectivo;
    }

    public String getNombreDirectivo() {
        return nombreDirectivo;
    }

    public void setNombreDirectivo(String nombreDirectivo) {
        this.nombreDirectivo = nombreDirectivo;
    }

    public String getApellidoDirectivo() {
        return apellidoDirectivo;
    }

    public void setApellidoDirectivo(String apellidoDirectivo) {
        this.apellidoDirectivo = apellidoDirectivo;
    }

    public String getIdDirectivo() {
        return idDirectivo;
    }

    public void setIdDirectivo(String idDirectivo) {
        this.idDirectivo = idDirectivo;
    }

    public String getCorreoDirectivo() {
        return correoDirectivo;
    }

    public void setCorreoDirectivo(String correoDirectivo) {
        this.correoDirectivo = correoDirectivo;
    }

    public String getContraseñaDirectivo() {
        return contraseñaDirectivo;
    }

    public void setContraseñaDirectivo(String contraseñaDirectivo) {
        this.contraseñaDirectivo = contraseñaDirectivo;
    }

    public String getRolDirectivo() {
        return rolDirectivo;
    }

    public void setRolDirectivo(String rolDirectivo) {
        this.rolDirectivo = rolDirectivo;
    }

    @Override
    public String toString() {
        return "DirectivoDTO{" + "nombreDirectivo=" + nombreDirectivo + ", apellidoDirectivo=" + apellidoDirectivo + ", idDirectivo=" + idDirectivo + ", correoDirectivo=" + correoDirectivo + ", contrase\u00f1aDirectivo=" + contraseñaDirectivo + ", rolDirectivo=" + rolDirectivo + '}';
    }
    
    
}
