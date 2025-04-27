package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmpleadoContratado extends Empleado{
	private int numeroContrato;
	private String medioDePago;
	
	public EmpleadoContratado(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento,
			double sueldoBasico, int numeroContrato, String medioDePago) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.setNumeroContrato(numeroContrato);
		this.setMedioDePago(medioDePago);
	}
	
	public double sueldoBruto() {
		return getSueldoBasico();
	}
	
	public double sueldoNeto() {
		return (double)0.1;
	}
	
	public double retenciones() {
		return 50;
	}

	public int getNumeroContrato() {
		return numeroContrato;
	}

	private void setNumeroContrato(int numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public String getMedioDePago() {
		return medioDePago;
	}

	private void setMedioDePago(String medioDePago) {
		this.medioDePago = medioDePago;
	}
	
	public List<Concepto> generarConceptos() {
        List<Concepto> conceptos = new ArrayList<>();
        conceptos.add(new Concepto("Sueldo Básico", getSueldoBasico()));
        conceptos.add(new Concepto("Gastos Administrativos Contractuales", -50));
        return conceptos;
    }
}
