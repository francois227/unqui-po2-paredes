package ar.edu.unq.po2.tp2;

import java.util.Date;

public class Empleado {
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private Date fechaNacimiento;
	private float sueldoBasico;
	
	public Empleado(String nombre, String direccion, String estadoCivil,
			Date fechaNacimiento, float sueldoBasico) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldoBasico = sueldoBasico;
	}
	
	public int calcularEdad() {
		return 0;
	}
	
	public float calcularSueldoBruto() {
		return (float)0.1;
	}
	
	public float calcularRetenciones() {
		return (float)0.1;
	}
	
	public float calcularSueldoNeto() {
		return (float)0.1;
	}
}
