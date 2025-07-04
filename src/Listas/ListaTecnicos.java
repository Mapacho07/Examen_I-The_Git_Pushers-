/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;
import MetodosGenericos.MetodoGenerico;
import Tecnicos.Tecnico;
/**
 *
 * @author Student
 */
public class ListaTecnicos implements MetodoGenerico<Tecnico>{
    private Tecnico Tecnicos[];
    
    public ListaTecnicos(){
        this.Tecnicos = new Tecnico[100];
    }
    
    @Override
    public boolean Añadir(Tecnico t){
        if(t==Buscar(t.getCedula()))
            return false;
        for(int i=0;i<100;i++){
            if(Tecnicos[i]==null){
                Tecnicos[i]=t;
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean Eliminar(Tecnico t){
        for(int i=0;i<100;i++){
            if(Tecnicos[i]==t){
                Tecnicos[i]=null;
                return true;
            }
        }
        return false;
    }
    
    @Override
    public Tecnico Buscar(Object id){
        for(int i=0;i<100;i++){
            if(String.valueOf(id).equals(Tecnicos[i].getCedula())){
                return Tecnicos[i];
            }
        }
        return null;
    }
    
    public String ListaEspecialidad(){
        for(int i=0;i<100;i++){
            if(null!=Tecnicos[i].getCedula()){
                return Tecnicos[i].getEspecialidad();
            }
        }
        return null;
    }
}
