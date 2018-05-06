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
public class MateriaDTO {
    
    private String nombreMateria;
    private String idMateria;
    private String idProfesor;

    public MateriaDTO(String nombreMateria, String idMateria, String idProfesor) {
        this.nombreMateria = nombreMateria;
        this.idMateria = idMateria;
        this.idProfesor = idProfesor;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }

    public String getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    @Override
    public String toString() {
        return "MateriaDTO{" + "nombreMateria=" + nombreMateria + ", idMateria=" + idMateria + ", idProfesor=" + idProfesor + '}';
    }
    
    
}
