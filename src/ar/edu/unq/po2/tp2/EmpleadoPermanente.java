package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmpleadoPermanente extends Empleado{
	private int cantidadHijos;
	private int antiguedad;
	
	public EmpleadoPermanente(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento,
			double sueldoBasico, int cantidadHijos, int antiguedad) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.setCantidadHijos(cantidadHijos);
		this.setAntiguedad(antiguedad);
	}
	
	public double sueldoBruto() {
		return getSueldoBasico() + 150 * cantidadHijos + (getEstadoCivil().equalsIgnoreCase("casado") ? 100 : 0) + 50 * antiguedad;
	}
	
	public double retenciones() {
		double obraSocial = 0.10 * sueldoBruto() + 20 * cantidadHijos;
        double aportesJubilatorios = 0.15 * sueldoBruto();
        return obraSocial + aportesJubilatorios;
	}

	public int getCantidadHijos() {
		return cantidadHijos;
	}

	private void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	private void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	public List<Concepto> generarConceptos() {
        List<Concepto> conceptos = new ArrayList<>();
        conceptos.add(new Concepto("Sueldo Básico", getSueldoBasico()));
        conceptos.add(new Concepto("Asignación por hijo", 150 * cantidadHijos));
        if (getEstadoCivil().equalsIgnoreCase("casado")) {
            conceptos.add(new Concepto("Asignación por cónyuge", 100));
        }
        conceptos.add(new Concepto("Antigüedad", 50 * antiguedad));
        conceptos.add(new Concepto("Obra Social", - (0.10 * sueldoBruto() + 20 * cantidadHijos)));
        conceptos.add(new Concepto("Aportes Jubilatorios", - (0.15 * sueldoBruto())));
        return conceptos;
    }
}
