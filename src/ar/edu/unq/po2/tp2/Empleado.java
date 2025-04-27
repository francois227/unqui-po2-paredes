package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Empleado {
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private LocalDate fechaNacimiento;
	private double sueldoBasico;
	
	public Empleado(String nombre, String direccion, String estadoCivil,
			LocalDate fechaNacimiento, double sueldoBasico) {
		this.setNombre(nombre);
		this.setDireccion(direccion);
		this.setEstadoCivil(estadoCivil);
		this.setFechaNacimiento(fechaNacimiento);
		this.setSueldoBasico(sueldoBasico);
	}
	
	public int edad() {
		var currentDate = LocalDate.now();
		var birthday = this.getFechaNacimiento();
		return currentDate.getYear() - birthday.getYear();
	}
	
	public abstract double sueldoBruto();
	
	public abstract double retenciones();
	
	public double sueldoNeto() {
		return sueldoBruto() - retenciones();
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	private void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	private void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public double getSueldoBasico() {
		return sueldoBasico;
	}

	private void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	
	public abstract List<Concepto> generarConceptos();
	
}
