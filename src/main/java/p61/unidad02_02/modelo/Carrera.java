/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad02_02.modelo;

import java.util.ArrayList;

/**
 *
 * @author Juano
 */
public class Carrera {

    private String nombre;
    private int numeroCiclo;
    private ArrayList<Estudiante> estudianteList;

    public Carrera(String nombre, int nuemeroCiclo) {
        this.nombre = nombre;
        this.numeroCiclo = nuemeroCiclo;
        this.estudianteList = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante e) {
        this.estudianteList.add(e);
    }

    public String getNombre() {
        return nombre;
    }

    public int getNuemeroCiclo() {
        return numeroCiclo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNuemeroCiclo(int nuemeroCiclo) {
        this.numeroCiclo = nuemeroCiclo;
    }

    @Override
    public String toString() {
        var retorno = "Carrera{" + "nombre=" + nombre + ", numeroCiclo=" + numeroCiclo + "\n" + '}';

        for (var estudiante : this.estudianteList) {
            retorno += estudiante.toString() + "\n";
        }

        return retorno;
    }

}
