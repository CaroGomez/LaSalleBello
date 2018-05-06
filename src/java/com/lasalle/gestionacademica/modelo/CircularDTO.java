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
public class CircularDTO {
    
    private String nombreCircular;
    private String idCircular;
    private String tipoCircular;
    private String textoCircular;

    public CircularDTO(String nombreCircular, String idCircular, String tipoCircular, String textoCircular) {
        this.nombreCircular = nombreCircular;
        this.idCircular = idCircular;
        this.tipoCircular = tipoCircular;
        this.textoCircular = textoCircular;
    }

    public String getNombreCircular() {
        return nombreCircular;
    }

    public void setNombreCircular(String nombreCircular) {
        this.nombreCircular = nombreCircular;
    }

    public String getIdCircular() {
        return idCircular;
    }

    public void setIdCircular(String idCircular) {
        this.idCircular = idCircular;
    }

    public String getTipoCircular() {
        return tipoCircular;
    }

    public void setTipoCircular(String tipoCircular) {
        this.tipoCircular = tipoCircular;
    }

    public String getTextoCircular() {
        return textoCircular;
    }

    public void setTextoCircular(String textoCircular) {
        this.textoCircular = textoCircular;
    }

    @Override
    public String toString() {
        return "CircularDTO{" + "nombreCircular=" + nombreCircular + ", idCircular=" + idCircular + ", tipoCircular=" + tipoCircular + ", textoCircular=" + textoCircular + '}';
    }
    
}
