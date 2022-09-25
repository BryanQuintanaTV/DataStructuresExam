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
public class CopiaParcial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo = new int[15];
       
        llenar(arreglo);
        
        System.out.println("\nIngrese la posición inicial");
        int valorIni = sc.nextInt();
        System.out.println("Ingrese la posición final");
        int valorFin = sc.nextInt();
        copiar(arreglo,valorIni,valorFin);
    }
    public static void llenar(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) ((Math.random() * 10) + 1);
            System.out.print("[ " + arreglo[i] + " ] ");
        }
    }
    
    public static void copiar(int[] arreglo, int valorIni, int valorFin){
        int cont=0;
        for (int i = valorIni; i <= valorFin; i++) {
            if ((arreglo[i] % 2) == 0) {
                cont++;
            }
        }
        int[] arregloCopia = new int[cont];
        int posicion = 0;
        
        for (int i = valorIni; i <= valorFin; i++) {
            if ((arreglo[i] % 2) == 0) {
                arregloCopia[posicion] = arreglo[i];
                posicion++;
            }
        }
        
        for (int i = 0; i < arregloCopia.length; i++) {
            System.out.print("[ " + arregloCopia[i] + " ] ");
        }
    }
}
