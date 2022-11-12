/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad02_02.servicio;

import java.util.ArrayList;
import java.util.List;
import p61.unidad02_02.modelo.Estudiante;

/**
 *
 * @author Juano
 */
public class EstudianteServicio {
     private List<Estudiante> estudianteList;

    public EstudianteServicio() {
        this.estudianteList = new ArrayList<>();
    }
     
    public void crear(Estudiante estudiante){
        this.estudianteList.add(estudiante);
        
    }
     
     public List<Estudiante> listar() {
        return this.estudianteList;
        
    }
public void EliminarPosicion(int posicion){
    this.estudianteList.remove(posicion);
}
}
