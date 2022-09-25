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
public class Juego_del_Ahorcado {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        char palabras[][];
        palabras = new char[5][];

        String p1 = "gato", p2 = "murcielago", p3 = "casa", p4 = "escuela", p5 = "computadora", e = " ";

        palabras[0] = new char[p1.length()];
        palabras[1] = new char[p2.length()];
        palabras[2] = new char[p3.length()];
        palabras[3] = new char[p4.length()];
        palabras[4] = new char[p5.length()];

        llenarPalabras(palabras, p1, p2, p3, p4, p5);

        int seguir = 0, oportunidad = 4, sino = 0;
        //Empezar el juego
        //Este do while hace que la ronda se ejecute mínimo una vez, si el jugador desea jugar de nuevo, entonces se repetira lo que esté dentro del do while
        do {
            //Genera numeros al azar de 0-4 (Posiciones del arreglo *palabras*)
            int l = (int) ((Math.floor(Math.random() * (6 - 1 + 1) + 1)) - 2);
            System.out.println(l);
            //Genera un arreglo del mismo tamaño que la palabra y esconde las palabras
            char[] hiddenWord = new char[palabras[l].length];
            for (int i = 0; i < hiddenWord.length; i++) {
                hiddenWord[i] = e.charAt(0);
            }
            //---------------------------------------------------------------//

            System.out.println("Bienvenido al juego del ahorcado. "
                    + "\nEsta es la palabra a encontrar.");
            for (int i = 0; i < hiddenWord.length; i++) {
                System.out.print("[ " + hiddenWord[i] + " ] ");
            }
            //con el dowhile se hace para preguntar la palabra o las letras al usuario
            do {
                System.out.println("\n¿Usted se sabe la palabra? 0=No, 1=Si ");
                System.out.println("Cunetas con: "+oportunidad +" oportunidades");
                int knowWord = leer.nextInt();

                if (knowWord == 1) {
                    int know = 0;
                    System.out.println("Escriba la palabra: ");
                    String t = leer.nextLine();
                    String tryWord = leer.nextLine();

                    for (int i = 0; i < tryWord.length(); i++) {
                        char letra = tryWord.charAt(i);
                        hiddenWord[i] = letra;
                    }
                    for (int i = 0; i < hiddenWord.length; i++) {
                        if (hiddenWord[i] == palabras[l][i]) {
                            know++;
                        }
                    }
                    if (know == palabras[l].length) {
                        System.out.println("Felicidades Ganaste");
                        oportunidad = 0;
                    } else {
                        System.out.println("Lo siento, haz perdido");
                        oportunidad = 0;
                    }

                } else if (knowWord == 0) {
                    
                    System.out.println("Escriba una letra");
                    String t = leer.nextLine();
                    String tryLetter = leer.nextLine();
                    char letra = tryLetter.charAt(0);
                    System.out.println("Letra escrita es: "+letra);
                    int con=0;
                    for (int i = 0; i < palabras[l].length; i++) {
                        if (palabras[l][i] == letra) {
                            hiddenWord[i] = letra;
                            con++;
                        }
                        
                    }
                    if (con > 0) {
                        for (int i = 0; i < hiddenWord.length; i++) {
                            System.out.print("[ " + hiddenWord[i] + " ] ");
                        }
                    }else if (con == 0) {
                        System.out.println("Lo sentimos, esa letra no existe ");
                        for (int i = 0; i < hiddenWord.length; i++) {
                            System.out.print("[ " + hiddenWord[i] + " ] ");
                        }
                        oportunidad--;
                    }
                    if (oportunidad == 0) {
                        System.out.println("\nLo sentimos haz perdido");
                    }
                    
                    if(con == palabras[l].length){
                        System.out.println("\nFelicidades Ganaste");
                        oportunidad = 0;
                    }
                }

            } while (oportunidad >= 1);

            //Preguntar si se desea jugar de nuevo
            System.out.println("\nDesea volver a jugar 0=No, 1=Si");
            int again = leer.nextInt();
            if (again == 1) {
                seguir = 0;
            } else {
                seguir++;
            }

        } while (seguir < 1);
    }

    public static void llenarPalabras(char[][] palabras, String p1, String p2, String p3, String p4, String p5) {

        for (int j = 0; j < p1.length(); j++) {
            char letra = p1.charAt(j);
            palabras[0][j] = letra;
        }

        for (int j = 0; j < p2.length(); j++) {
            char letra = p2.charAt(j);
            palabras[1][j] = letra;
        }

        for (int j = 0; j < p3.length(); j++) {
            char letra = p3.charAt(j);
            palabras[2][j] = letra;
        }

        for (int j = 0; j < p4.length(); j++) {
            char letra = p4.charAt(j);
            palabras[3][j] = letra;
        }

        for (int j = 0; j < p5.length(); j++) {
            char letra = p5.charAt(j);
            palabras[4][j] = letra;
        }
    }

}
