/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana5;

/**
 *
 * @author Gabriel
 */
import java.util.Random;
import java.util.Scanner;
public class Zelaya_Gabriel_Exam1 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        Random random = new Random();
        
        System.out.println("Menú:");
        System.out.println("1. PIRAMIDE");
        System.out.println("2. CLAVE");
        System.out.println("3. PIEDRA, PAPEL, TIJERA");
        System.out.println("4. ADIVINAR");
        System.out.println("5. SALIR");
        System.out.print("Elige una opción (1-5):");    
        
        int opcion = input.nextInt();
        
        while(opcion!=5){
            
            if(opcion<1 || opcion>5){
                
                System.out.println("Opción invalida");
                
            }
            
            if(opcion==1){
                
                System.out.println("Opcion seleccionada: PIRAMIDE");
                System.out.print("Ingresar cantidad de filas de la piramide: ");
                int filasPiramide = input.nextInt();
                int numero = 1;
                
                for(int i =0; i<filasPiramide; i++){
                    int sumaFila = 0;
                    int numsEnFila= i+1;
                    
                
                        System.out.println("  ");
                    
                    
                    for(int j=0; j<numsEnFila; j++){
                        System.out.print(numero+" ");
                        sumaFila+=numero;
                        numero+=2;
                    }
                    System.out.print("= "+sumaFila);
                }
            }
            
            if(opcion==2){
                
                System.out.println("Opcion seleccionada: CLAVE");
            }
            
            if(opcion==3){
                
                int computerChoice = random.nextInt(3);
                String choice = "";
                String volverJugar ="";
                System.out.println("Opcion seleccionada: PIEDRA, PAPEL, TIJERA");
                System.out.println("");
                
                do{
                    System.out.println("Bienvenido(a) a: PIEDRA, PAPEL, TIJERA");
                    System.out.println("");
                    System.out.print("Ingrese su elección: ");
                    String eleccion = input.next();

                    while(!eleccion.equalsIgnoreCase("piedra") && !eleccion.equalsIgnoreCase("papel") && !eleccion.equalsIgnoreCase("tijera")){
                        System.out.println("Opción invalida");
                        System.out.print("Ingrese su elección: ");
                        eleccion = input.next();
                    }

                    System.out.println("");

                    switch(computerChoice){

                        case 0:
                            choice = "Piedra";
                        break;

                        case 1:
                            choice = "Papel";
                        break;

                        case 2:
                            choice = "Tijera";
                        break;
                    }

                    System.out.println("Computadora: "+choice);

                    if(eleccion.equalsIgnoreCase("piedra") && choice=="Piedra" || eleccion.equalsIgnoreCase("papel") && choice=="Papel" || eleccion.equalsIgnoreCase("tijera") && choice=="Tijera"){
                        System.out.println("");
                        System.out.println("Resultado: Empate");
                    }

                    if(eleccion.equalsIgnoreCase("piedra") && choice=="Tijera" || eleccion.equalsIgnoreCase("papel") && choice=="Piedra" || eleccion.equalsIgnoreCase("tijera") && choice=="Papel"){
                        System.out.println("");
                        System.out.println("Resultado: GANASTE!");
                    }

                    if(eleccion.equalsIgnoreCase("piedra") && choice=="Papel" || eleccion.equalsIgnoreCase("papel") && choice=="Tijera" || eleccion.equalsIgnoreCase("tijera") && choice=="Piedra"){
                        System.out.println("");
                        System.out.println("Resultado: PERDISTE!");
                    }
                    
                    System.out.print("Deseas volver a jugar? (Si o No): ");
                    volverJugar = input.next();
                    
                    while(!volverJugar.equalsIgnoreCase("si") && !volverJugar.equalsIgnoreCase("no")){
                        System.out.println("Opcion invalida");
                        System.out.print("Deseas volver a jugar? (Si o No): ");
                        volverJugar = input.next();
                    }
                            
                }while(volverJugar.equalsIgnoreCase("si"));   
            }
            
            if(opcion==4){
                
                System.out.println("Opcion seleccionada: ADIVINAR");
            }
            
            System.out.println("");
            System.out.println("");
            System.out.println("Menú:");
            System.out.println("1. PIRAMIDE");
            System.out.println("2. CLAVE");
            System.out.println("3. PIEDRA, PAPEL, TIJERA");
            System.out.println("4. ADIVINAR");
            System.out.println("5. SALIR");
            System.out.print("Elige una opción (1-5):");
            
            opcion = input.nextInt();
        }
    }
}
