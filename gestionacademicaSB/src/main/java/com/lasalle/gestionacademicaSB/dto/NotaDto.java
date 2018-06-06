/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lasalle.gestionacademicaSB.dto;

/**
 *
 * @author Alexis Herrera
 */
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.validator.constraints.Range;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

public class NotaDto {
   
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
  
   @Range
   private float titleNota;
   
   @Range
   private Long materia_id;
    
   @Range
   private int idPersona;
   
   @Temporal(TemporalType.TIMESTAMP)
   @CreatedDate
   private Date createdAt;
   
   @Temporal(TemporalType.TIMESTAMP)
   @LastModifiedDate
   private Date updatedAt;
   
   public NotaDto() {
    }

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
		   
      
   
}
