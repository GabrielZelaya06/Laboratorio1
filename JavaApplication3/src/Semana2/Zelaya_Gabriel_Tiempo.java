/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana2;

/**
 *
 * @author Gabriel
 */
import java.util.Scanner;
public class Zelaya_Gabriel_Tiempo {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        
        System.out.println("Ingresar segundos: ");
        int segundosIngresados = input.nextInt();
        String check = (segundosIngresados>=0) ? "Número valido" : "Número invalido";
        System.out.println(check);
          
        if(segundosIngresados>0){
            
            int horas = segundosIngresados/3600;
            int restos = segundosIngresados%3600;
            int minutos = restos/60;
            int segundos = restos%60;
            
            System.out.println("Horas: " +horas);
            System.out.println("Minutos: " +minutos);
            System.out.println("Segundos: " +segundos);
        }
        
    }
}
