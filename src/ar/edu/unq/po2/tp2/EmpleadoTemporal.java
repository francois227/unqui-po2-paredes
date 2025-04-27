package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoTemporal extends Empleado{
	private LocalDate fechaFin;
	private int horasExtras;
	
	public EmpleadoTemporal(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento,
			double sueldoBasico, LocalDate fechaFin, int horasExtras) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.setFechaFin(fechaFin);
		this.setHorasExtras(horasExtras);
	}
	
	public double sueldoBruto() {
		return getSueldoBasico() + 40 * getHorasExtras();
	}
	
	public double retenciones() {
		double obraSocial = 0.10 * sueldoBruto() + (edad() > 50 ? 25 : 0);
        double aportesJubilatorios = 0.10 * sueldoBruto() + 5 * getHorasExtras();
        return obraSocial + aportesJubilatorios;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	private void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	private void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}
	
	public List<Concepto> generarConceptos() {
        List<Concepto> conceptos = new ArrayList<>();
        conceptos.add(new Concepto("Sueldo Básico", getSueldoBasico()));
        conceptos.add(new Concepto("Horas Extras", 40 * getHorasExtras()));
        conceptos.add(new Concepto("Obra Social", - (0.10 * sueldoBruto() + (edad() > 50 ? 25 : 0))));
        conceptos.add(new Concepto("Aportes Jubilatorios", - (0.10 * sueldoBruto() + 5 * getHorasExtras())));
        return conceptos;
    }
}
