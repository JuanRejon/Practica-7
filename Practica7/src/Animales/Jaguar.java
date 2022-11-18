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
public class Jaguar extends Animal implements IAnimales{

    public Jaguar(){
        
    }
    
    public Jaguar(String comida){
        this.comer(comida);
    }
    
    @Override
    public String dormir(){
        return "Se ha dormido el jaguar.";
    }
    
    public int getDistancia_corrida() {
        return distancia_corrida;
    }

    public void setDistancia_corrida(int distancia_corrida) {
        this.distancia_corrida = distancia_corrida;
    }
    
    private int distancia_corrida;
    
    @Override
    public String caminar(){
        return "El jaguar esta caminando.";
    }
    
    @Override
    public String despertar(){
        return "El jaguar se ha despertado";
    }
    
    private void comer(String comida){
        System.out.println("El jaguar comenzo a comer " + comida); 
    }
}
