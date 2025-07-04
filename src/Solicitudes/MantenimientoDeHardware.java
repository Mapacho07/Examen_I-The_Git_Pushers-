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
public class MantenimientoDeHardware {

    private String codigo;
    //falta agregar el equipo que hay q sacarlo del trabajo de nazareth
    private String motivo;
    private LocalDate fecha;
    private String pieza;

    public MantenimientoDeHardware(String codigo, String motivo, LocalDate fecha, String pieza) {
        this.codigo = codigo;
        this.motivo = motivo;
        this.fecha = LocalDate.now();
        this.pieza = pieza;
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

    public String getPieza() {
        return pieza;
    }

    @Override
    public String toString() {
        return "MantenimientoDeHardware{" + "codigo=" + codigo + ", motivo=" + motivo + ", fecha=" + fecha + ", pieza=" + pieza + '}';
    }

}
