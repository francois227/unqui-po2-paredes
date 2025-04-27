package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Empresa {
	private String nombre;
	private String cuit;
	private List<Empleado> empleados = new ArrayList<>();
    private List<ReciboHaberes> recibos = new ArrayList<>();
	
	public Empresa(String nombre, String cuit) {
		this.nombre = nombre;
		this.cuit = cuit;
	}
	
	public void agregarEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
    }
	
	public double montoTotalSueldosNetosEmpleados() {
		return empleados.stream()
                .mapToDouble(e -> e.sueldoNeto())
                .sum();
	}
	
	public double montoTotalSueldosBrutosEmpleados() {
		return empleados.stream()
                .mapToDouble(e -> e.sueldoBruto())
                .sum();
	}
	
	public double montoTotalRetencionesEmpleados() {
		return empleados.stream()
                .mapToDouble(e -> e.retenciones())
                .sum();
	}
	
	public void liquidarSueldos() {
        recibos.clear();
        for (Empleado empleado : empleados) {
            ReciboHaberes recibo = new ReciboHaberes(
                empleado.getNombre(),
                empleado.getDireccion(),
                LocalDate.now(),
                empleado.sueldoBruto(),
                empleado.sueldoNeto(),
                empleado.generarConceptos()
            );
            recibos.add(recibo);
        }
    }
	
	public List<ReciboHaberes> getRecibos(){
		return this.recibos;
	}
}
