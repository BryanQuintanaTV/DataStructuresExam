/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exam;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class Comparar_Arreglos_Similares {
    public static void main(String[] args) {

        Scanner spect = new Scanner(System.in);
        
        int[] arregloUno = new int[10];
        int[] arregloDos = new int[10];
        
        for (int i = 0; i < arregloUno.length; i++) {
            System.out.print("Ingresa un numero (primer arreglo): ");
            arregloUno[i] = spect.nextInt();
        }
        
        System.out.println("");
        
        for (int i = 0; i < arregloDos.length; i++) {
            System.out.print("Ingresa un numero (segundo arreglo: ");
            arregloDos[i] = spect.nextInt();
        }
        
        System.out.println("");
        
      int contS=0;
        for(int i=0; i<arregloUno.length; i++ ){
            for(int j=0; j<arregloDos.length; j++){
                if(arregloUno[i]==arregloUno[j]) contS++;
            }
        }

        if(contS==arregloUno.length || contS==arregloDos.length) {
            for (int i = 0; i < arregloUno.length; i++) {
                System.out.print("[" + arregloUno[i] + "]");
            }
            System.out.println("");
            for (int i = 0; i < arregloDos.length; i++) {
                System.out.print("[" + arregloDos[i] + "]");
            }
            System.out.println();
            System.out.println("Los arreglos son similares");
        }else{
            for (int i = 0; i < arregloUno.length; i++) {
                System.out.print("[" + arregloUno[i] + "]");
            }
            System.out.println("");
            for (int i = 0; i < arregloDos.length; i++) {
                System.out.print("[" + arregloDos[i] + "]");
            }
            System.out.println();
            System.out.println("Los arreglos no son similares");
        }
    
    }
}
