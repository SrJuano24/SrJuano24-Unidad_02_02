/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad02_02.modelo;

import java.time.LocalDate;

/**
 *
 * @author Juano
 */
public class Jugador {

    private String nombre;
    private double peso;
    private int estatura;
    private LocalDate fechaNacimiento;

    public Jugador(String nombre, double peso, int estatura, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.peso = peso;
        this.estatura = estatura;
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechanacimiento() {
        return fechaNacimiento;
    }

    public void setFechanacimiento(LocalDate fechanacimiento) {
        this.fechaNacimiento = fechanacimiento;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", peso=" + peso
                + ", estatura=" + estatura + ", fechaNacimiento="
                + fechaNacimiento + "su edad es: " + this.calcularEdad()+'}'+"\n";
    }

    private int calcularEdad() {
        var retorno = 0;
        var yearActual = LocalDate.now().getYear();
        var mesActual = LocalDate.now().getMonthValue();
        var diaActual = LocalDate.now().getDayOfMonth();
        var mes = mesActual - this.fechaNacimiento.getMonthValue();
        var dia = diaActual - this.fechaNacimiento.getDayOfMonth();

        if (mes < 0) {
            retorno = yearActual - this.fechaNacimiento.getYear() - 1;

        } else {
            if (mes == 0) {
                if (dia < 0) {
                    retorno = yearActual - this.fechaNacimiento.getYear() - 1;
                } else {
                    retorno = yearActual - this.fechaNacimiento.getYear();
                }
            } else {
                retorno = yearActual - this.fechaNacimiento.getYear();
            }
        }
        return retorno;
    }
}
