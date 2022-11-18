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
public class Cocodrilo extends Animal implements IAnimales{
    
    public Cocodrilo(){
        
    }
    
    public Cocodrilo(String comida){
        this.comer(comida);
    }
    
    @Override
    public String dormir(){
        return "Se ha dormido el cocodrilo.";
    }
    
    public String nada(){
        return "El cocodrilo esta nadando.";
    }
    
    @Override
    public String caminar(){
        return "El cocodrilo esta caminando.";
    }
    
    @Override
    public String despertar(){
        return "El cocodrilo se ha despertado.";
    }
    
    private void comer(String comida){
        System.out.println("El cocodrilo comenzo a comer " + comida); 
    }
}
