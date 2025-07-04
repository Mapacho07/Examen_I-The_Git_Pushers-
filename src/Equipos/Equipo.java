/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Equipos;

/**
 *
 * @author Student
 */
public class Equipo {
    public String Codigo;
    public String Descripcion;
    public String Ubicacion;
    public Estados estado;
    public String getCodigo() {
        return Codigo;
    }

    public Estados getEstado() {
        return estado;
    }

    
    public String getDescripcion() {
        return Descripcion;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Equipo(String Codigo, String Descripcion, String Ubicacion,Estados estado) {
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
        this.Ubicacion = Ubicacion;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Equipo{" + "Codigo=" + Codigo + ", Descripcion=" + Descripcion + ", Ubicacion=" + Ubicacion + ", estado=" + estado + '}';
    }

   

   
  
    
 
}
