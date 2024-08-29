package ar.edu.unq.po2.tp2;

import java.util.List;

public class Empresa {
	private String nombre;
	private String cuit;
	private List<Empleado> empleados;
	
	public Empresa(String nombre, String cuit, List<Empleado> empleados) {
		this.nombre = nombre;
		this.cuit = cuit;
		this.empleados = empleados;
	}
	
	public float montoTotalSueldosNetosEmpleados() {
		return (float)0.1;
	}
	
	public float montoTotalSueldosBrutosEmpleados() {
		return (float)0.1;
	}
	
	public float montoTotalRetencionesEmpleados() {
		return (float)0.1;
	}
	
	public void liquidarSueldos() {
		
	}
}
