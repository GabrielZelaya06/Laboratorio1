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
public class Zelaya_Gabriel_Pagos {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        
        System.out.println("Código: ");
        int codigo = input.nextInt();
        System.out.println("Nombre: ");
        String nombre = input.next();
        System.out.println("Apellido: ");
        String apeliido = input.next();
        System.out.println("Horas trabajdas: ");
        int horasT = input.nextInt();
        System.out.println("Categoría 1 - $40 por hora extra\n" +"\n" +"Categoría 2 - $50 por hora extra\n" +"\n" +"Categoría 3 - $85 por hora extra.\n" +"\n" +"Categoría 4 - $0");
        System.out.println("Categoría: ");
        int categoria = input.nextInt();
        
        double salario = horasT * 35.99;
        int horasE = horasT-40;
        
        
                
        if(horasT>40){
            salario = 40 * 35.99;
        }
        
        
        switch(categoria){
            case 1:
                if(horasE>15){
                    double salarioE = 15*40;
                    System.out.println("Cantidad a pagar: $"+salario+salarioE);
                }else{
                    double salarioE = horasE*40;
                    System.out.println("Cantidad a pagar: $"+salario+salarioE);
                }
            
            break;
            case 2:
                if(horasE>15){
                    double salarioE = 15*50;
                    System.out.println("Cantidad a pagar: $"+salario+salarioE);
                }else{
                    double salarioE = horasE*50;
                    System.out.println("Cantidad a pagar: $"+salario+salarioE);
                }
            
            break;
            case 3:
                if(horasE>15){
                    double salarioE = 15*85;
                    System.out.println("Cantidad a pagar: $"+salario+salarioE);
                }else{
                    double salarioE = horasE*85;
                    System.out.println("Cantidad a pagar: $"+salario+salarioE);
                }
            ;
            break;
            case 4:
                double salarioE=0;
            System.out.println("Cantidad a pagar: $"+salario+salarioE);
            break;
            default:
            System.out.println("Opción invalida");
            
        }
    }
}
