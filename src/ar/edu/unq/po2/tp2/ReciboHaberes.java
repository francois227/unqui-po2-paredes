package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class ReciboHaberes {
	private String nombreEmpleado;
	private String direccion;
	private LocalDate fechaEmision;
	private double sueldoBruto;
	private double sueldoNeto;
	private List<Concepto> conceptos;
	
	public ReciboHaberes(String nombreEmpleado, String direccion, 
			LocalDate fechaEmision, double sueldoBruto, double sueldoNeto, List<Concepto> conceptos) {
		this.setNombreEmpleado(nombreEmpleado);
		this.setDireccion(direccion);
		this.setFechaEmision(fechaEmision);
		this.setSueldoBruto(sueldoBruto);
		this.setSueldoNeto(sueldoNeto);
		this.setConceptos(conceptos);
	}
	
	public String getNombreEmpleado() {
		return this.nombreEmpleado;
	}
	
	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public LocalDate getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(LocalDate fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public double getSueldoBruto() {
		return sueldoBruto;
	}

	public void setSueldoBruto(double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}

	public double getSueldoNeto() {
		return sueldoNeto;
	}

	public void setSueldoNeto(double sueldoNeto) {
		this.sueldoNeto = sueldoNeto;
	}

	public List<Concepto> getConceptos() {
		return conceptos;
	}

	public void setConceptos(List<Concepto> conceptos) {
		this.conceptos = conceptos;
	}
	
	
}
