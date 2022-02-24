package ciclo_while;

import java.util.Scanner;

public class Ciclo_For {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.print("que tabla deseas: -> ");
        int numero = lectura.nextInt();
        for (int k = 1; k <= 10; k++) {
            int producto = numero * k;
            System.out.println("numero " + numero + " * " + k + " = " + producto);
        }
    }

}
