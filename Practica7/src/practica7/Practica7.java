/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica7;
import Animales.Cocodrilo;
import Animales.Perro;
import Animales.Jaguar;
import Animales.Gorrion;
import Animales.Gato;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Juan Carlos
 */
public class Practica7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int prom = 0, cont = 0;
        
        ArrayList <Animal> al = new ArrayList <>();
        
        Animal perro = new Perro();
        Animal gato = new Gato();
        Animal gorrion = new Gorrion();
        Animal jaguar = new Jaguar();
        Animal cocodrilo = new Cocodrilo();
        
        al.add(perro);
        al.add(gato);
        al.add(gorrion);
        al.add(jaguar);
        al.add(cocodrilo);
        
        System.out.println("----Ingresando datos...-----\n");
        
        for(Animal myA:al){
            System.out.println("Nombre:");
            myA.setNombre(scan.nextLine());
            System.out.println("Ingresa la edad:");
            
            try{
                int r = Integer.parseInt(in.readLine());
                myA.setEdad(r);
            }catch(Exception ex){
                System.out.println(ex.toString());
            }
            
            System.out.println("Ingresa la distancia caminada:");
            
            try{
                int g = Integer.parseInt(in.readLine());
                myA.setDistancia_caminada(g);
                prom = prom + g;
            }catch(Exception ex){
                System.out.println(ex.toString());
            }
        }
     
        System.out.println("Ingrese la comida de los 5 animales:");
        Perro dog = new Perro(scan.nextLine());
        Gato cat = new Gato(scan.nextLine());
        Gorrion bird = new Gorrion(scan.nextLine());
        Cocodrilo alligator = new Cocodrilo(scan.nextLine());
        Jaguar bigcat = new Jaguar(scan.nextLine());
        
        System.out.println("Color del perro:");
        dog.setColor(scan.nextLine());
        System.out.println("Raza del gato:");
        cat.setRaza(scan.nextLine());
        System.out.println("Numero de huevos del gorrion:");
        try{
            int c = Integer.parseInt(in.readLine());
            bird.setNum_huevos(c);
                
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        
        System.out.println("-----OUTPUT------");
        
        for(Animal myA:al){
            System.out.println(myA.despertar());
            System.out.println(myA.getNombre());
            System.out.println(myA.getDistancia_caminada());
            System.out.println(myA.caminar());
            System.out.println("\n");
        }
        System.out.println("Distancia corrida por el jaguar:");
        try{
            int l = Integer.parseInt(in.readLine());
            bigcat.setDistancia_corrida(l);
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        
        System.out.println(dog.ladrar());
        System.out.println("Color del perro: " + dog.getColor());
        System.out.println(cat.maullar());
        System.out.println("Raza del gato: " +cat.getRaza());
        System.out.println(bird.volar(30));
        System.out.println("Numero de huevos del gorrion: " + bird.getNum_huevos());
        System.out.println(alligator.nada());
        System.out.println("Distancia corrida por el jaguar: " + bigcat.getDistancia_corrida());
        
        System.out.println("Promedio de la distancia caminada: " + (prom/5));
        
        System.out.println(dog.dormir());
        System.out.println(cat.dormir());
        System.out.println(bird.dormir());
        System.out.println(alligator.dormir());
        System.out.println(bigcat.dormir());
    }
    
}
