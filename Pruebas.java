/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author ChavaC
 */
public class Pruebas {
import java.util.Scanner;

public class Dibujo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el tamaño del lienzo (por ejemplo, 5 7): ");
        int alto = scanner.nextInt();
        int ancho = scanner.nextInt();

        System.out.println("\nDibujo:");

        char[][] lienzo = new char[alto][ancho];

        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                lienzo[i][j] = ' ';
            }
        }

        while (true) {
            System.out.println("Introduce la posición donde quieres poner un asterisco (por ejemplo, 2 3), o escribe 'fin' para terminar: ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }

            String[] partes = entrada.split(" ");
            int posX = Integer.parseInt(partes[0]);
            int posY = Integer.parseInt(partes[1]);

            if (posX >= 1 && posX <= ancho && posY >= 1 && posY <= alto) {
                lienzo[posY - 1][posX - 1] = '*';
            } else {
                System.out.println("La posición no es válida.");
            }
        }

        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print(lienzo[i][j]);
            }
            System.out.println();

            }
        
        }
    }
}
    

