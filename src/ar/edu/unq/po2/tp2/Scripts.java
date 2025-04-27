package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class Scripts {
	public static void main(String[] args) {
		
		//script 1
		Empresa empresa = new Empresa("MiEmpresa", "30-12345678-9");

		empresa.agregarEmpleado(new EmpleadoPermanente("Juan", "Calle Falsa 123", "casado", LocalDate.of(1980, 5, 10), 50000, 2, 10));
		empresa.agregarEmpleado(new EmpleadoTemporal("Ana", "Calle Verdadera 456", "soltero", LocalDate.of(1995, 8, 25), 40000, LocalDate.of(2025, 12, 31), 5));
		empresa.agregarEmpleado(new EmpleadoContratado("Luis", "Avenida Siempreviva 789", "soltero", LocalDate.of(1990, 7, 12), 45000, 1, "transferencia"));

		System.out.println("Total Sueldos Netos: " + empresa.montoTotalSueldosNetosEmpleados());
		
		
		//script 2
		empresa.liquidarSueldos();

		//mostrar recibos generados
		for (ReciboHaberes recibo : empresa.getRecibos()) {
		    System.out.println("Recibo para: " + recibo.getNombreEmpleado());
		    for (Concepto concepto : recibo.getConceptos()) {
		        System.out.println(concepto.getDescripcion() + ": " + concepto.getMonto());
		    }
		    System.out.println("Sueldo Bruto: " + recibo.getSueldoBruto());
		    System.out.println("Sueldo Neto: " + recibo.getSueldoNeto());
		    System.out.println("--------------------");
		}
    }
}
