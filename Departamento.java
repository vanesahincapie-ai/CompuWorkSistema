/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuworksistema;

/**
 *
 * @author luis.cardona
 */
import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private final String nombre;
    private final List<Empleado> empleados;

    public Departamento(String nombreDepartamento) {
        this.nombre = nombreDepartamento;
        this.empleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

   //CRUD
   public boolean agregarEmpleado (Empleado nuevoEmpleado) {
       if (empleados.contains(nuevoEmpleado))  {
          System.out.println("El empleado ya esta en este departamento.");
          return false;
        }
        empleados.add(nuevoEmpleado);
        System.out.println("Empleado agregado correctamente.");
        return true;
   }
   
    public Empleado buscarEmpleado(Empleado empleadoBuscado) {
        for (Empleado e : empleados) {
            if (e.equals(empleadoBuscado)) {
                return e;
            }
        }
        System.out.println(" Empleado no encontrado en el departamento.");
        return null;
   }

   
   public Empleado eliminarEmpleado(Empleado empleadoAEliminar) {
        if (empleados.remove(empleadoAEliminar)) {
            System.out.println(" Empleado eliminado correctamente.");
            return empleadoAEliminar;
        } else {
            System.out.println(" No se pudo eliminar, el empleado no existe en este departamento.");
            return null;
        }
    }
   
      public String mostrarEmpleados() {
        if (empleados.isEmpty()) {
            return "No hay empleados en este departamento.";
        }

        StringBuilder lista = new StringBuilder("Lista de Empleados:\n");
        for (Empleado e : empleados) {
            lista.append(e.toString()).append("\n");
        }
        return lista.toString();
    }
}
