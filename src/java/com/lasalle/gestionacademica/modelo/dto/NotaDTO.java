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
public class NotaDTO {
    
    private String nombreNota;
    private String idNota;
    private double nota;
    private double notaAcumulada;

    public NotaDTO(String nombreNota, String idNota, double nota, double notaAcumulada) {
        this.nombreNota = nombreNota;
        this.idNota = idNota;
        this.nota = nota;
        this.notaAcumulada = notaAcumulada;
    }

    public String getNombreNota() {
        return nombreNota;
    }

    public void setNombreNota(String nombreNota) {
        this.nombreNota = nombreNota;
    }

    public String getIdNota() {
        return idNota;
    }

    public void setIdNota(String idNota) {
        this.idNota = idNota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getNotaAcumulada() {
        return notaAcumulada;
    }

    public void setNotaAcumulada(double notaAcumulada) {
        this.notaAcumulada = notaAcumulada;
    }

    @Override
    public String toString() {
        return "NotaDTO{" + "nombreNota=" + nombreNota + ", idNota=" + idNota + ", nota=" + nota + ", notaAcumulada=" + notaAcumulada + '}';
    }
   
}
