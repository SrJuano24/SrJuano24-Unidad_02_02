/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad02_02.servicio;

import java.util.ArrayList;
import java.util.List;
import p61.unidad02_02.modelo.Jugador;

/**
 *
 * @author Juano
 */
public class JugadorServicio {

    private List<Jugador> jugadorList;

    public JugadorServicio() {
        this.jugadorList = new ArrayList<>();
    }

    public void crear(Jugador jugador) {
        this.jugadorList.add(jugador);

    }

    public List<Jugador> listar() {
        return this.jugadorList;
    }
public void EliminarPosicion(int posicion){
    this.jugadorList.remove(posicion);
}
}
