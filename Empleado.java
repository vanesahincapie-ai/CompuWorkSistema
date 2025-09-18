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
import java.util.Date;
import java.util.List;

public abstract class Empleado {
  private static long contadorId = 1L;
  private long idEmpleado; 
  private String nombre;
  private String apellido;
  private String cargo;
  private double salario;
  private Date fechaIngreso;
  private String beneficios;
  
  private final List<ReporteDesempeño> reporte; 
  
    public Empleado(int idEmpleado, String nombre, String apellido, String cargo, double salario, Date fechaIngreso) {
        this.idEmpleado = contadorId++;
        this.nombre = nombre;
        this.apellido = apellido; 
        this.cargo = cargo;
        this.salario = (salario < 0) ? 0 : salario;
        this.fechaIngreso = fechaIngreso;
        this.beneficios = beneficios; 
        this.reporte = new ArrayList <>();
    }

    
    public long getEmpleado() {
        return idEmpleado;
    }

      public void setIdEmpleado(long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
           if (salario < 0) {
            System.out.println("El salario no puede ser negativo.");
            this.salario = 0;
        } else {
            this.salario = salario;
       
           }
    }
    public String getBeneficios(){
         return beneficios;
     }     
    
     public void setBeneficios(String beneficios){
         this.beneficios = cargo;
     }
     public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
 public void obtenerReporte(ReporteDesempeño r) {
        reporte.add(r);
    }

    public List<ReporteDesempeño> visualizarReporte() {
        return reporte;
    }
    
       @Override
    public String toString() {
        return "ID: " + idEmpleado +
               ", Nombre: " + nombre + " " + apellido +
               ", Cargo: " + cargo +
               ", Salario: " + salario +
               ", Fecha de ingreso: " + fechaIngreso;
    }
    
    public abstract String generarReporteDesempeño();
    
}
