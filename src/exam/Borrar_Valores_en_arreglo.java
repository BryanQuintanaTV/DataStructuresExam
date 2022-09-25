/*
 * 
 * 
 */
package exam;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class Borrar_Valores_en_arreglo {

    public static void main(String args[]) {
        int[] numeros = new int[15];
        llenar(numeros);
        System.out.print("Arreglo: ");
        imprimirArreglo(numeros);
        Scanner teclado = new Scanner(System.in);
        for (int x = 1; x <= numeros.length; x++) {

            System.out.println("");
            System.out.println("Introduce el numero del arreglo que quieres borrar: ");
            int num = teclado.nextInt();

            int ocurrencias = 0;
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] == num) {
                    ocurrencias++;

                    for (int j = i; j < numeros.length - 1; j++) {
                        numeros[j] = numeros[j + 1];

                    }
                }
            }
            int[] numerosFinal;
            int le = numeros.length - ocurrencias;
            numerosFinal = new int[le];
            for (int i = 0; i < le; i++) {
                numerosFinal[i] = numeros[i];
            }

            imprimirArreglo(numerosFinal);

        }
    }

    private static void imprimirArreglo(int n[]) {
        for (int i = 0; i < n.length; i++) {
            System.out.print("[" + n[i] + "]");
        }
        System.out.println("");
    }

    public static void llenar(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
    }

}
