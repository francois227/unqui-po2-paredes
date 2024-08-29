package ar.edu.unq.po2.tp2;

import java.util.Date;
import java.util.List;

public class ReciboHaberes {
	private String nombreEmpleado;
	private String direccion;
	private Date fechaEmision;
	private float sueldoBruto;
	private float sueldoNeto;
	private List<Concepto> conceptos;
	
	public ReciboHaberes(String nombreEmpleado, String direccion, 
			Date fechaEmision, float sueldoBruto, float sueldoNeto) {
		this.nombreEmpleado = nombreEmpleado;
		this.direccion = direccion;
		this.fechaEmision = fechaEmision;
		this.sueldoBruto = sueldoBruto;
		this.sueldoNeto = sueldoNeto;
	}
	
	public void generarRecibo() {
		
	}
}
