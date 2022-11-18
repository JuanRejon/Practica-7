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
public class Gorrion extends Animal implements IAnimales{

    public int getNum_huevos() {
        return num_huevos;
    }

    public void setNum_huevos(int num_huevos) {
        this.num_huevos = num_huevos;
    }
    
    @Override
    public String dormir(){
        return "Se ha dormido el gorrion.";
    }
    
    public Gorrion(){
        
    }
    
    public Gorrion(String comida){
        this.comer(comida);
    }
    
    @Override
    public String caminar(){
        return "El gorrion esta caminando para tomar impulso para volar.";
    }
    
    @Override
    public String despertar(){
        return "El gorrion se ha despertado.";
    }
    
    public String volar(int altura){
        return "El gorrion esta volando a " + altura + " ms de altura.";
    }
    
    private void comer(String comida){
        System.out.println("El gorrion comenzo a comer " + comida); 
    }
    
    private int num_huevos;
}
