package ar.edu.unq.po2.tp2;

import java.util.Date;

public class EmpleadoPermanente extends Empleado{
	private int cantidadHijos;
	private int antiguedad;
	
	public EmpleadoPermanente(String nombre, String direccion, String estadoCivil, Date fechaNacimiento,
			float sueldoBasico, int cantidadHijos, int antiguedad) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.cantidadHijos = cantidadHijos;
		this.antiguedad = antiguedad;
	}
	
	public float calcularSueldoBruto() {
		return (float)0.1;
	}
	
	private float salarioFamiliar() {
		return (float)0.1;
	}
	
	public float calcularRetenciones() {
		return (float)0.1;
	}
	
}
