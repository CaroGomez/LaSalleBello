/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lasalle.gestionacademicaSB.constants;

/**
 *
 * @author Alexis Herrera
 */
public class ValidatorConstants {
   //Validators
    public static final String REGEX_EMAIL =
            "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    public static final int MIN_SIZE_EMAIL = 5;
    public static final int MAX_SIZE_EMAIL = 50;
    public static final int MIN_SIZE_NOMBRE = 3;
    public static final int MAX_SIZE_NOMBRE = 50;
	public static final int MIN_SIZE_APELLIDO = 5;
    public static final int MAX_SIZE_APELLIDO = 50;
    public static final int MIN_SIZE_PASSWORD = 8;
    public static final int MAX_SIZE_PASSWORD = 15;
	public static final int MIN_SIZE_NUMERODOCUMENTO = 6;
	public static final int MAX_SIZE_NUMERODOCUMENTO = 11;
	public static final int MIN_SIZE_TELEFONO = 7;
	public static final int MAX_SIZE_TELEFONO = 10;

    //Messages
    public static final String BAD_FORMAT_EMAIL_MESSSAGE = "Error en el formato de Email";
    public static final String BAD_SIZE_EMAIL_MESSSAGE = "El email debe contener al menos entre 5 y 20 Caracteres";
    public static final String BAD_SIZE_PASSWORD_MESSAGE = "La Contraseña debe contener entre 8 y 15 Caracteres";
    public static final String BAD_SIZE_NAME_MESSSAGE = "El nombre debe contener entre 3 y 50 caracteres";
	public static final String BAD_SIZE_APELLIDO_MESSSAGE = "El Apellido debe contener entre 5 y 50 caracteres";
	public static final String BAD_SIZE_NUMERODOCUMENTO_MESSSAGE = "Debe ingresar un número de documento válido";
	public static final String BAD_SIZE_TELEFONO_MESSSAGE = "Debe ingresar un número de Teléfono válido";
}
