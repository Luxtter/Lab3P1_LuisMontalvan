/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_luismontalvan;

import java.util.Scanner;
public class Lab3P1_LuisMontalvan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner pochita= new Scanner(System.in);
        Scanner morgana= new Scanner(System.in);
        
        //Ejercicio 3
        OUTER:
        do {
            System.out.println("Menu");
            System.out.println("1.Ejercio 1");
            System.out.println("2.Ejercio 2");
            System.out.println("3.Ejercio 3");
            System.out.println("4.Salir");
            System.out.println("Porfavor elija una opcion: ");
            int opc= pochita.nextInt();
            switch (opc) {
            //1
                case 1:
                    
                    String cadena= morgana.next();
        //Ejercicio 1
        System.out.println("Ingrese una cadena: "+cadena);
        int largo= cadena.length();
        for(int i=0;i<=largo;i++){
            int puntos;
            int letra= cadena.charAt(i);
            System.out.print(letra);
            
            
            
        }
       
                    break;
            //2
                case 2:
                    double resultado;
            int k= pochita.nextInt();
        for(int n= 1;n<=k;n++){
            double parte1= 2*n+1;
            double parte2= (n*n+3);  
            
            
            resultado= parte1 / parte2;
            System.out.println("El resultado es de:"+resultado);
        }
                    break;
                case 3:
                    //3
                    System.out.println("Ingrese la altura del Reloj (Tiene que ser un numero impar):");
                    int altura= pochita.nextInt();
                    for(int i= 1;i<=altura;i++){
                        if(i==1||i==altura){
                          System.out.print("* ");  
                        }else{
                            
                        }
                        
                    
                   } 
                    System.out.println(" ");  
                    break;
                case 4:
                    break OUTER;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (true);
    }
    
}
