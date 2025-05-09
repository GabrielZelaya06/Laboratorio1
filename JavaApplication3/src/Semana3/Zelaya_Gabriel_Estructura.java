/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana3;

/**
 *
 * @author Gabriel
 */
import java.util.Scanner;
import java.util.Random;
public class Zelaya_Gabriel_Estructura {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        Random random = new Random();
        
        //contadores para cada opción del menú
        int contador1=0;
        int contador2=0;
        int contador3=0;
        int contador4=0;
        
        
        //Menú principal
        System.out.println("Menú:");
        System.out.println("1. Palabra al reves");
        System.out.println("2. Número perfecto");
        System.out.println("3. Primos");
        System.out.println("4. Votaciones");
        System.out.println("5. Salir");
        
        int opcion = input.nextInt();
        
        //Este ciclo se repite hasta que se seleccione la opción 5
        while(opcion!=5){
            
            if(opcion==1){
                
                System.out.println("Ingresar cantidad de palabras: ");
                int cantidadPalabras = input.nextInt();
                
                String palabraMlarga = "";
                int tamañoPalabra = 0;
                
                for(int i = 0; i<cantidadPalabras; i++){
                    System.out.println("Ingresar una palabra: ");
                    String palabra = input.next();
                    String palabraInv = "";
                    //invertir la palabra
                    for(int j = palabra.length()-1; j>=0; j--){
                        palabraInv += palabra.charAt(j);
                    }
                    System.out.println("Palabra invertida: "+palabraInv);
                    //verificar si es palíndromo o no
                    if(palabra.equalsIgnoreCase(palabraInv)){
                        System.out.println("Sí, es un palíndromo.");
                    }else{
                        System.out.println("No, no es un palíndromo.");
                    }
                    //verificar cual es la palabra mas larga
                    if(palabra.length() > tamañoPalabra){
                       palabraMlarga = palabra;
                       tamañoPalabra = palabra.length();
                       
                    }else if(palabra.length()==tamañoPalabra){
                        System.out.println("Hay empate de palabras más largas.");
                    }
                }
                
                System.out.println("Palabra más larga: "+palabraMlarga);
                String palabraInvFinal = "";
                for(int k = palabraMlarga.length() - 1; k>=0; k--){
                    palabraInvFinal += palabraMlarga.charAt(k);
                    
                }
                //verificar si la palabra mas larga es un palíndromo
                if(palabraMlarga.equalsIgnoreCase(palabraInvFinal)){
                    System.out.println("La palabra más larga es un palíndromo");
                }else{
                    System.out.println("La palabra más larga no es un palíndromo");
                }
                //Se suma 1 al contador de opción 1
                contador1 ++;
            }
            
            
            if(opcion==2){
                
                System.out.println("Ingresar un numero entero: ");
                int num = input.nextInt();
                
                int sumaDiv = 0;
                int posibleDiv = 1;
                
                //sumar todos los divisores del numero
                while(posibleDiv<num){
                    if(num % posibleDiv ==0){
                        sumaDiv += posibleDiv;
                    }
                    posibleDiv++;
                }
                //verificar si el numero es perfecto
                if(sumaDiv==num){
                    System.out.println("El numero "+num+" es perfecto");
                }else{
                    System.out.println("El numero "+num+" no es perfecto");
                }
                //Se suma 1 al contador de opción 2
                contador2 ++;
            }
            
            
            if(opcion==3){
                
                //generar el numero random del 1 al 100
                int numRandom = random.nextInt(100) + 1;
                System.out.println("Numero aleatorio: "+numRandom);
                
                int cantDivi =0;
                
                System.out.println("Divisores de "+numRandom+": ");
                
                //contar los divisores del numero
                for(int i=1; i<=numRandom; i++){
                    if(numRandom % i == 0){
                        System.out.println(i+" ");
                        cantDivi++;
                    }
                }
                //verificar si tiene dos divisores para saber si es primo
                if(cantDivi ==2){
                    System.out.println("Es un numero primo");
                }else{
                    System.out.println("No es un numero primo");
                }
                //Se suma 1 al contador de opción 3
                contador3 ++;
            }
            
            
            if(opcion==4){
                
                int vAzules=0;
                int vNegros=0;
                int vAmarillos=0;
                int vRojos=0;
                int vNulos=0;
                
                System.out.println("Ingrese la cantidad de votantes: ");
                int numVotantes = input.nextInt();
                
                //leer los votos
                for(int i = 0; i< numVotantes; i++){
                    System.out.println("Voto #"+(i+1)+" (AZUL, NEGRO, AMARILLO, ROJO): ");
                    String voto = input.next();
                    
                    if(voto.equalsIgnoreCase("AZUL")){
                        vAzules++;
                    }else if(voto.equalsIgnoreCase("NEGRO")){
                        vNegros++;
                    }else if(voto.equalsIgnoreCase("AMARILLO")){
                        vAmarillos++;
                    }else if(voto.equalsIgnoreCase("ROJO")){
                        vRojos++;
                    }else{
                        vNulos++;
                    }
                        
                }
                
                int validos = vAzules + vNegros + vAmarillos + vRojos;
                double porcentajeVotosValidos = (validos*100)/numVotantes;
                
                System.out.println("Resultados: ");
                
                //verificar si la votacion es valida o no
                if(porcentajeVotosValidos>=60){
                    String planillaGanadora="";
                    int masVotos = vAzules;                   
                    planillaGanadora="AZUL";
                    
                    if(vNegros>masVotos){
                        masVotos=vNegros;
                        planillaGanadora="NEGRO";
                    }
                    if(vAmarillos>masVotos){
                        masVotos=vAmarillos;
                        planillaGanadora="AMARILLO";
                    }
                    if(vRojos>masVotos){
                        masVotos=vRojos;
                        planillaGanadora="ROJO";
                    }
                    System.out.println("La planilla ganadora es: "+planillaGanadora+" con "+masVotos+" votos");
                    
                }else{
                    System.out.println("VOTACIÓN FALLIDA");
                }
                //Se suma 1 al contador de opción 4
                contador4 ++;
            }
            
            
        //volver a mostrar el menú    
        System.out.println("");//salto de línea
        System.out.println("Menú:");
        System.out.println("1. Palabra al reves");
        System.out.println("2. Número perfecto");
        System.out.println("3. Primos");
        System.out.println("4. Votaciones");
        System.out.println("5. Salir");
        
        opcion = input.nextInt();
        }
        //mostrar cuantas veces se utilizó cada opción
        System.out.println("Opción número 1 fue seleccionada: "+contador1+" veces");
        System.out.println("Opción número 2 fue seleccionada: "+contador2+" veces");
        System.out.println("Opción número 3 fue seleccionada: "+contador3+" veces");
        System.out.println("Opción número 4 fue seleccionada: "+contador4+" veces");
    }
    
}
