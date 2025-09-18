/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compuworksistema;

/**
 *
 * @author luis.cardona
 */

import java.util.Date;

public class CompuWorkSistema {
    public static void main(String[] args) {

        // Crear departamento
        Departamento depTI = new Departamento("Tecnología");

        // Crear empleados permanentes y temporales
        Empleado e1 = new EmpleadoPermanente(
                0, // El id se asigna automáticamente, puedes pasar 0
                "Juan", 
                "Pérez", 
                "Analista", 
                2500000, 
                new Date(), 
                "Seguro médico, Vacaciones", 
                new Date() // Fecha fin de contrato
        );

        Empleado e2 = new EmpleadoTemporal(
                0, // Id automático
                "Ana", 
                "Gómez", 
                "Asistente", 
                1800000, 
                new Date(), 
                "Seguro médico básico", 
                true // Contrato definido
        );

        // Agregar empleados al departamento
        depTI.agregarEmpleado(e1);
        depTI.agregarEmpleado(e2);

        // Mostrar empleados
        System.out.println("=== Lista de empleados en " + depTI.getNombre() + " ===");
        System.out.println(depTI.mostrarEmpleados());

        // Generar reportes individuales
        System.out.println("\n=== Reportes individuales ===");
        System.out.println(e1.generarReporteDesempeño());
        System.out.println(e2.generarReporteDesempeño());

        // Generar reporte de departamento
        System.out.println("\n=== Reporte del departamento ===");
        for (Empleado e : depTI.getEmpleados()) {
            System.out.println(e.generarReporteDesempeño());
        }

        // Eliminar empleado
        depTI.eliminarEmpleado(e1);
        System.out.println("\nDespués de eliminar a Juan:");
        System.out.println(depTI.mostrarEmpleados());
    }
}
