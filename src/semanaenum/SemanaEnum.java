/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semanaenum;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */

public class SemanaEnum {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solicitar que el usuario ingrese un dia y que le digamos si es laborable o no.
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingresar un dia de la semana");
        
        String dia = scan.next();
        
        try{
             DiasSemana diaIngresado = DiasSemana.valueOf(dia.toUpperCase());
         switch(diaIngresado){
           case LUNES:
           case MARTES:
           case MIERCOLES:
           case JUEVES:
           case VIERNES:
                System.out.println("El dia " + diaIngresado+ " es laborable" );
                break;
           case SABADO:
           case DOMINGO:
               System.out.println("El dia " + diaIngresado + " no es laborable");
               break;
              
           default:
              System.out.println("Dia incorrecto");
              break;
       }
        }
        
        catch(Exception e){
            
            System.out.println("El dia ingresado es incorrecto");
            
        }
        
        
        
        
   
        
    }
    
}
