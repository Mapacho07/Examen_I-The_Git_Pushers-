/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import MetodosGenericos.MetodoGenerico;
import Equipos.Equipo;
import Equipos.Estados;
/**
 *
 * @author Student
 */
public class ListaEquipos implements MetodoGenerico<Equipo>{
    private Equipo Equipos[];
    private int CantidadEquipos[];

    public ListaEquipos() {
        this.Equipos = new Equipo[100];
        this.CantidadEquipos = new int[3];
    }
    
    @Override
    public boolean Añadir(Equipo t){
        if(t==Buscar(t.getCodigo()))
            return false;
        for(int i=0;i<100;i++){
            if(Equipos[i]==null){
                Equipos[i]=t;
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean Eliminar (Equipo t){
        for(int i=0;i<100;i++){
            if(Equipos[i]==t){
                Equipos[i]=null;
                return true;
            }
        }
        return false;
    }
    
    @Override
    public Equipo Buscar(Object id){
        for(int i=0;i<100;i++){
            if(String.valueOf(id).equals(Equipos[i].getCodigo())){
                return Equipos[i];
            }
        }
        return null;
    }
    
    public int[] CantidadEquipos(){
        for(int i=0;i<100;i++){
            if(Equipos[i].getEstado()==Estados.FUERADESERVICIO){
                CantidadEquipos[0]=+1;
            }
            if(Equipos[i].getEstado()==Estados.ENREVISION){
                CantidadEquipos[1]=+1;
            }
            if(Equipos[i].getEstado()==Estados.OPERATIVO){
                CantidadEquipos[2]=+1;
            }
        }
        return CantidadEquipos;
    }
}
