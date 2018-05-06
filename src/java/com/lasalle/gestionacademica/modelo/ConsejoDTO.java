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
public class ConsejoDTO {
    
    private String nombreConsejo;
    private String idConsejo;

    public ConsejoDTO(String nombreConsejo, String idConsejo) {
        this.nombreConsejo = nombreConsejo;
        this.idConsejo = idConsejo;
    }

    public String getNombreConsejo() {
        return nombreConsejo;
    }

    public void setNombreConsejo(String nombreConsejo) {
        this.nombreConsejo = nombreConsejo;
    }

    public String getIdConsejo() {
        return idConsejo;
    }

    public void setIdConsejo(String idConsejo) {
        this.idConsejo = idConsejo;
    }

    @Override
    public String toString() {
        return "ConsejoDTO{" + "nombreConsejo=" + nombreConsejo + ", idConsejo=" + idConsejo + '}';
    }
    
}
