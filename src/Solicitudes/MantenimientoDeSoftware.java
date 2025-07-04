/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Solicitudes;

import java.time.LocalDate;

/**
 *
 * @author Student
 */
public class MantenimientoDeSoftware {

    //falta agregar el equipo que hay q sacarlo del trabajo de nazareth
    private String codigo;
    private String motivo;
    private LocalDate fecha;
    private String programa;

    public MantenimientoDeSoftware(String codigo, String motivo, LocalDate fecha, String programa) {
        this.codigo = codigo;
        this.motivo = motivo;
        this.fecha = LocalDate.now();
        this.programa = programa;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getMotivo() {
        return motivo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getPrograma() {
        return programa;
    }

    @Override
    public String toString() {
        return "MantenimientoDeSoftware{" + "codigo=" + codigo + ", motivo=" + motivo + ", fecha=" + fecha + ", programa=" + programa + '}';
    }

}
