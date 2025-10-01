
package programas; // <-- ¡Esta línea debe ir PRIMERO!

import java.util.Scanner;

public class prueba {

    public static void main(String[] args) {
        // Inicializar el objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // --- 1. Entrada de Datos ---
        System.out.println("--- REGISTRO DE COMPRAS ---");

        // Registrar el nombre del cliente
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();

        // Registrar las tres compras
        System.out.print("Ingrese el monto de la Compra 1: ");
        double compra1 = scanner.nextDouble(); // Se usa double para manejar valores con decimales

        System.out.print("Ingrese el monto de la Compra 2: ");
        double compra2 = scanner.nextDouble();

        System.out.print("Ingrese el monto de la Compra 3: ");
        double compra3 = scanner.nextDouble();

       
        scanner.close();

        
        double totalCompras = compra1 + compra2 + compra3;

      
        final int NUMERO_DE_COMPRAS = 3; // Usar una constante para el divisor
        double promedioCompras = totalCompras / NUMERO_DE_COMPRAS;

        // --- 3. Resultados ---
        System.out.println("\n--- RESULTADOS DEL CLIENTE ---");
        System.out.println("Cliente: " + nombreCliente);
       
        System.out.printf("Total de Compras (tc): $%.2f%n", totalCompras);
        System.out.printf("Promedio de Compras (pc): $%.2f%n", promedioCompras);
        System.out.println("------------------------------");
    }
}
// La llave extra al final ha sido eliminada.