package ar.edu.unq.po2.tp2;

import java.util.Date;

public class EmpleadoTemporal extends Empleado{
	private Date fechaFin;
	private int horasExtras;
	
	public EmpleadoTemporal(String nombre, String direccion, String estadoCivil, Date fechaNacimiento,
			float sueldoBasico, Date fechaFin, int horasExtras) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.fechaFin = fechaFin;
		this.horasExtras = horasExtras;
	}
	
	public float calcularSueldoBruto() {
		return (float)0.1;
	}
	
	private float montoHorasExtras() {
		return (float)0.1;
	}
	
	public float calcularRetenciones() {
		return (float)0.1;
	}
}
