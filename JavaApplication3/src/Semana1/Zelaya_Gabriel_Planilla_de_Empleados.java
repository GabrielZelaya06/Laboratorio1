/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana1;

/**
 *
 * @author Gabriel
 */
import java.util.Scanner;

public class Zelaya_Gabriel_Planilla_de_Empleados {
    public static void main(String[] args){
        
       Scanner input = new Scanner(System.in).useDelimiter("\n");
       
       System.out.println("Ingresar nombre del empleado: ");
       String nombre = input.next();
      
       System.out.println("Ingresar horas trabajadas mensualmente: ");
       int horas_trabajadas = input.nextInt();
       
       System.out.println("Ingresar tarifa por hora: ");
       double tarifa = input.nextDouble();
       
       double salarioSemanal = tarifa*5;
       
       System.out.println("----- Boleta del Empleado -------");
       System.out.println("Nombre del Empleado: \""+nombre+"\"");
       System.out.println("Horas de Trabajo Mensual: "+horas_trabajadas);
       System.out.println("Tarifa por Hora : Lps."+tarifa);
       System.out.println("Salario del Empleado Semanal: Lps."+salarioSemanal);
    }
} 
