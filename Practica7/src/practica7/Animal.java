/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica7;

/**
 *
 * @author Juan Carlos
 */
public abstract class Animal {

    public int getDistancia_caminada() {
        return distancia_caminada;
    }

    public void setDistancia_caminada(int distancia_caminada) {
        this.distancia_caminada = distancia_caminada;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    private int edad;
    private String nombre;
    private int distancia_caminada;
    
    public abstract String caminar();
    public abstract String despertar();
    
    
}
