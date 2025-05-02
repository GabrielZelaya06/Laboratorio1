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
public class Zelaya_Gabriel_Fecha {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        
        System.out.println("Ingresar fecha 1: (DD/MM/AAAA)");
        String fecha1 = input.next();
        System.out.println("Ingresar fecha 2: (DD/MM/AAAA)");
        String fecha2 = input.next();
        
        String primerDia = fecha1.substring(0, 2);
        String primerMes = fecha1.substring(3, 5);
        String primerAño = fecha1.substring(6, 10);
        String segundoDia = fecha2.substring(0, 2);
        String segundoMes = fecha2.substring(3, 5);
        String segundoAño = fecha2.substring(6, 10);
        
        int primerDiaInt = Integer.parseInt(primerDia);
        int primerMesInt = Integer.parseInt(primerMes);
        int primerAñoInt = Integer.parseInt(primerAño);
        int segundoDiaInt = Integer.parseInt(segundoDia);
        int segundoMesInt = Integer.parseInt(segundoMes);
        int segundoAñoInt = Integer.parseInt(segundoAño);
        
        
        int totalAño1= primerAñoInt * 360 + primerMesInt * 30 + primerDiaInt;
        int totalAño2= segundoAñoInt * 360 + segundoMesInt * 30 + segundoDiaInt;
        
        int diferencia = totalAño1-totalAño2;
        
        System.out.println("La diferencia son: "+Math.abs(diferencia)+" días");
    }
    
}
