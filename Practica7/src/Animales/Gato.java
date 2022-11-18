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
public class Gato extends Animal implements IAnimales{

    public Gato(){
        
    }
    
    public Gato(String comida){
        this.comer(comida);
    }
    
    @Override
    public String dormir(){
        return "Se ha dormido el gato.";
    }
    
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    @Override
    public String caminar(){
        return "El gato esta caminando.";
    }
    
    @Override
    public String despertar(){
        return "El gato se ha despertado.";
    }
    
    private String raza;
    
    public String maullar(){
        return "El gato esta maullando.";
    }
    
    private void comer(String comida){
        System.out.println("El gato comenzo a comer " + comida); 
    }
}
