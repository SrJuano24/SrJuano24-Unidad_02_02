/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad02_02.vista;

import java.time.LocalDate;
import p61.unidad02_02.modelo.Atencion;
import p61.unidad02_02.modelo.Carrera;
import p61.unidad02_02.modelo.Dueño;
import p61.unidad02_02.modelo.Estudiante;
import p61.unidad02_02.modelo.Mascota;

/**
 *
 * @author morti
 */
public class Principal02_02 {
    
    public static void main(String[] args) {
       /* var juana = new Dueño("0104048794","Juana Moreno Dávila");
        juana.nuevoTelefono("0984357604", 0, "Móvil personal", "Bellsouth");
        juana.nuevoTelefono("072818314", 0, "Casa", "Etapa");
        juana.nuevoTelefono("0984357604", 0, "Móvil de mi esposo", "Movistar");
        
        var pilichi = new Mascota("Pilichi", "Gato", "Siamés", 4.6, juana);
        
        var atencion = new Atencion(LocalDate.of(2022,10,9),"Dr. Masache",45,pilichi);
        atencion.nuevaReceta("paracetamol", 24, "1 cada 8 horas", 0);
        atencion.nuevaReceta("suero", 1, "1 hasta finalizar", 1);
        
        System.out.println(atencion.toString());*/
       
         
        var pedro= new Estudiante("4759394059", "Pedro");
        var luis =new Estudiante("2309483948", "Luis");
        var emilio=new Estudiante("01034565949","Emilio");
        
        var tele=new Carrera("Ingenieria en telecomunicaciones",3);
        tele.agregarEstudiante(pedro);
        tele.agregarEstudiante(luis);
        
        var elec=new Carrera("Ingenieria en electronica",2);
        elec.agregarEstudiante(pedro);
        elec.agregarEstudiante(luis);
        
         var der=new Carrera("Derecho",6);
        der.agregarEstudiante(emilio);
        
        System.out.println(tele.toString());
        System.out.println(elec.toString());
        System.out.println(der.toString());
        
    }
    
}
