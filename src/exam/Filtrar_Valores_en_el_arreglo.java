/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exam;

/**
 *
 * @author bryan
 */
public class Filtrar_Valores_en_el_arreglo {

    public static void main(String[] args) {
        int[] arregloDatos = new int[15];
        System.out.print("[");
        llenar(arregloDatos);
        System.out.print("]");

    }

    public static void llenar(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 101);

            if (arreglo[i] % 2 == 0) {

                if (arreglo[i] < i) {
                    System.out.print(arreglo[i] + ",");
                } else if (arreglo[i] > i) {
                    System.out.print(arreglo[i] + ",");
                } else {

                }
            } else {
                i--;
            }

        }
    }
}
