/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Equipos;

/**
 *
 * @author Student
 */
public enum Estados {
    OPERATIVO("Operativo"),
    ENREVISION("En Revision"),
    FUERADESERVICIO("Fuera de servicio");
    
    private final String estado;
    

    private Estados(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Estados{" + "estado=" + estado + '}';
    }
    
    
}
