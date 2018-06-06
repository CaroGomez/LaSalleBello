/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lasalle.gestionacademicaSB.entity;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "persona")

public class Persona {
   
    @Id
    @GeneratedValue
    private Long id;
	
	@Column
	private String tipodocumento;
	
	@Column
	private Long numerodedocumento;
	
	@Column
    private String nombre;
		
	@Column
    private String apellidos;

    @Column
    private String email;

    @Column
    private String telefono;
	
    @Column
    private String sexo;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date fechanacimiento;


    public Persona() {
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
	  return apellidos;
   }

   public void setApellidos(String apellidos) {
	  this.apellidos = apellidos;
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

    

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Persona persona = (Persona) o;

        return id != null ? id.equals(persona.id) : persona.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
