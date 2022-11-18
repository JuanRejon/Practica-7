/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;
import practica7.Animal;
/**
 *
 * @author Juan Carlos
 */
public class Perro extends Animal implements IAnimales{

    public Perro(){
        
    }
    
    public Perro(String comida){
        this.comer(comida);
    }
    
    @Override
    public String dormir(){
        return "Se ha dormido el perro";
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    private String color;
    
    @Override
    public String caminar(){
        return "El perro esta caminando.";
    }
    
    @Override
    public String despertar(){
        return "El perro se ha despertado.";
    }
    
    public String ladrar(){
        return "El perro esta ladrando.";
    }
    
    private void comer(String comida){
        System.out.println("El perro comenzo a comer " + comida); 
    }
    
}
