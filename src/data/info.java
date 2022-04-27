/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author LaptopHp
 */
public class info extends Object {
    String nombre, carrera;
    String matricula;

    public info(String nombre, String carrera, String matricula) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.matricula = matricula;
    }

    public String getNombre() {
        return "el nombre es: " + nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return "la carrera cursando es: " + carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getMatricula() {
        return "la matricula del estudiante es: " + matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
