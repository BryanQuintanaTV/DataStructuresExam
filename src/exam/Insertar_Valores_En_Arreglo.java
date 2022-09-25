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
public class Insertar_Valores_En_Arreglo {

    public static void main(String[] args) {
        String[] matriz = new String[15];
        llenar(matriz);

    }

    private static void llenar(String[] matriz) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i] == null) {
                matriz[i] = "";
            }
        }      
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("\nAgregue un valor");
            String valor = sc.nextLine();


            for (int j = 14; j >= 0 ; j--) {
                if (j > 0) {
                    matriz[j] = matriz[j-1];
                }else{
                    matriz[0] = valor;
                }                
            }
            
            for (int k = 14; k >= 0; k--) {
                System.out.print("[ " + matriz[k] + " ] ");
            }

        }
    }
}
