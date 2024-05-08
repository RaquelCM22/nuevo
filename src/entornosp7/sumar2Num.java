package entornosp7;

import java.util.Scanner;

public class sumar2Num {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el primer número
        System.out.print("Ingresa el primer número: ");
        double numero1 = scanner.nextDouble();

        // Pedir al usuario que ingrese el segundo número
        System.out.print("Ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();

        // Sumar los dos números ingresados
        double suma = numero1 + numero2;

        // Mostrar el resultado
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);

        // Cerrar el objeto Scanner para evitar pérdida de recursos
        scanner.close();
    }
}
