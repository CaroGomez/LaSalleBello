/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lasalle.gestionacademicaSB.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.lasalle.gestionacademicaSB.constants.ValidatorConstants;
import java.util.Date;

public class PersonaDto {
   private Long id;

   private String tipodocumento;
   
   @NotNull
   @Size(min = ValidatorConstants.MIN_SIZE_NUMERODOCUMENTO, max = ValidatorConstants.MAX_SIZE_NUMERODOCUMENTO, message = ValidatorConstants.BAD_SIZE_NUMERODOCUMENTO_MESSSAGE)
   private Long numerodedocumento;
   
   @NotNull
   @Size(min = ValidatorConstants.MIN_SIZE_NOMBRE, max = ValidatorConstants.MAX_SIZE_NOMBRE, message = ValidatorConstants.BAD_SIZE_NAME_MESSSAGE)
   private String nombre;
   
   @NotNull
   @Size(min = ValidatorConstants.MIN_SIZE_APELLIDO, max = ValidatorConstants.MAX_SIZE_APELLIDO, message = ValidatorConstants.BAD_SIZE_APELLIDO_MESSSAGE)
   private String apellido;
	   
   @NotNull
   @Size(min = ValidatorConstants.MIN_SIZE_EMAIL, max = ValidatorConstants.MAX_SIZE_EMAIL, message = ValidatorConstants.BAD_SIZE_EMAIL_MESSSAGE)
   @Pattern(regexp = ValidatorConstants.REGEX_EMAIL, message = ValidatorConstants.BAD_FORMAT_EMAIL_MESSSAGE)
   private String email;

   @NotNull
   @Size(min = ValidatorConstants.MIN_SIZE_TELEFONO, max = ValidatorConstants.MAX_SIZE_TELEFONO, message = ValidatorConstants.BAD_SIZE_TELEFONO_MESSSAGE)
   private String telefono;
	
   private String sexo;
   
   private Date fechanacimiento;


    public PersonaDto() {
    }

   public Long getId() {
	  return id;
   }

   public void setId(Long id) {
	  this.id = id;
   }

   public String getTipodocumento() {
	  return tipodocumento;
   }

   public void setTipodocumento(String tipodocumento) {
	  this.tipodocumento = tipodocumento;
   }

   public Long getNumerodedocumento() {
	  return numerodedocumento;
   }

   public void setNumerodedocumento(Long numerodedocumento) {
	  this.numerodedocumento = numerodedocumento;
   }

   public String getNombre() {
	  return nombre;
   }

   public void setNombre(String nombre) {
	  this.nombre = nombre;
   }

   public String getApellidos() {
	  return apellido;
   }

   public void setApellidos(String apellidos) {
	  this.apellido = apellidos;
   }

   public String getEmail() {
	  return email;
   }

   public void setEmail(String email) {
	  this.email = email;
   }

   public String getTelefono() {
	  return telefono;
   }

   public void setTelefono(String telefono) {
	  this.telefono = telefono;
   }

   public String getSexo() {
	  return sexo;
   }

   public void setSexo(String sexo) {
	  this.sexo = sexo;
   }

   public Date getFechanacimiento() {
	  return fechanacimiento;
   }

   public void setFechanacimiento(Date fechanacimiento) {
	  this.fechanacimiento = fechanacimiento;
   }
}
