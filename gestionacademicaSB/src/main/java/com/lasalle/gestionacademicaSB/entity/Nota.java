/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lasalle.gestionacademicaSB.entity;

/**
 *
 * @author Alexis Herrera
 */
import java.util.Date;
import javax.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Table(name = "nota")

public class Nota {
   
   @Id
   @GeneratedValue
   private Long id;
   
   @Column
   private float titleNota;
   
   @Column
   private Long materia_id;
   
   @Column
   private int idPersona;
   
   @Column(nullable = false, updatable = false)
   @Temporal(TemporalType.TIMESTAMP)
   @CreatedDate
   private Date createdAt;
   
   @Column(nullable = false)
   @Temporal(TemporalType.TIMESTAMP)
   @LastModifiedDate
   private Date updatedAt;

   public Long getId() {
	  return id;
   }

   public void setId(Long id) {
	  this.id = id;
   }

   public float getTitleNota() {
	  return titleNota;
   }

   public void setTitleNota(float titleNota) {
	  this.titleNota = titleNota;
   }

   public Long getMateria_id() {
	  return materia_id;
   }

   public void setMateria_id(Long materia_id) {
	  this.materia_id = materia_id;
   }

   public int getIdPersona() {
	  return idPersona;
   }

   public void setIdPersona(int idPersona) {
	  this.idPersona = idPersona;
   }

   public Date getCreatedAt() {
	  return createdAt;
   }

   public void setCreatedAt(Date createdAt) {
	  this.createdAt = createdAt;
   }

   public Date getUpdatedAt() {
	  return updatedAt;
   }

   public void setUpdatedAt(Date updatedAt) {
	  this.updatedAt = updatedAt;
   }
   
   @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Nota nota = (Nota) o;

        return id != null ? id.equals(nota.id) : nota.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
   
}
