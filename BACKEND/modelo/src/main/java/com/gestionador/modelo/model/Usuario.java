package com.gestionador.modelo.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIO")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_USUARIO")
	private Long id;

	@Column(name = "NOMBRE_USUARIO")
	private String nombreUsuario;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "TELEONO")
	private String telefono;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "APELLIDO")
	private String apellido;

	@Column(name = "CUIT_CUIL")
	private String cuitOcuil;

	@Column(name = "EDAD")
	private int edad;

	@Column(name = "FECHA_NACIMIENTO")
	private Date fechaDeNacimiento;
}
