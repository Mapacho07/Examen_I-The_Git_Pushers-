/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tecnicos;

/**
 *
 * @author Student
 */
public class Tecnico {
    public String Cedula;
    public String Nombre;
    public String Especialidad;

    public String getCedula() {
        return Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public Tecnico(String Cedula, String Nombre, String Especialidad) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Especialidad = Especialidad;
    }

    @Override
    public String toString() {
        return "Tecnico{" + "Cedula=" + Cedula + ", Nombre=" + Nombre + ", Especialidad=" + Especialidad + '}';
    }
     

      
      
}
