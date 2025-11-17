import java.util.Arrays;
import java.util.Scanner;

public class SortingWorkbench {
    private static int[] currentArray = new int[0];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("===PRUEBAS===");

        while (true) {
            mostrarMenu();
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    ingresarNumeros();
                    break;
                case "2":
                    ejecutarAlgoritmo("SelectionSort");
                    break;
                case "3":
                    ejecutarAlgoritmo("InsertionSort");
                    break;
                case "4":
                    ejecutarAlgoritmo("BubbleSort");
                    break;
                case "5":
                    System.out.println("Saliendo del programa. ¡Adiós!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
    }

    /**
     * Muestra el menú principal y el estado del arreglo actual.
     */
    private static void mostrarMenu() {
        System.out.println("MENÚ PRINCIPAL");
        System.out.println("-------------------------------");
        System.out.println("Arreglo actual en memoria: " + Arrays.toString(currentArray));
        System.out.println("1. Datos a insertar");
        System.out.println("2. Ejecutar SelectionSort");
        System.out.println("3. Ejecutar InsertionSort");
        System.out.println("4. Ejecutar BubbleSort");
        System.out.println("5. Salir");
        System.out.println("-------------------------------");
        System.out.print("Elige una opción: ");
    }

    private static void ingresarNumeros() {
        int n = 0; // Número de elementos
        while (true) {
            try {
                System.out.print("¿Cuántos valores quieres ingresar? ");
                n = Integer.parseInt(scanner.nextLine());
                if (n < 0) {
                    System.out.println("Por favor, ingresa un número positivo");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, ingresa un número.");
            }
        }

        if (n == 0) {
            currentArray = new int[0];
            System.out.println("Arreglo actualizado a: []");
            return;
        }

        int[] newArray = new int[n];
        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    System.out.print("  Ingresa el valor #" + (i + 1) + ": ");
                    newArray[i] = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println(" Número no válido. Intenta de nuevo.");
                }
            }
        }
        currentArray = newArray;
        System.out.println("Arreglo actualizado a: " + Arrays.toString(currentArray));
    }

    private static void ejecutarAlgoritmo(String nombreAlgoritmo) {
        // Validar que el arreglo no esté vacío
        if (currentArray.length == 0) {
            System.out.println("Error: El arreglo está vacío. Ingresa datos primero (Opción 1).");
            return;
        }

        System.out.println(nombreAlgoritmo);
        System.out.println("--------------------------------------");

        //Usamos una copia para no modificar el 'currentArray' original
        int[] copy = Arrays.copyOf(currentArray, currentArray.length);

        SortingUtils.printArray(copy);
        switch (nombreAlgoritmo) {
            case "SelectionSort":
                SelectionSort.sort(copy, true);
                break;
            case "InsertionSort":
                InsertionSort.sort(copy, true);
                break;
            case "BubbleSort":
                BubbleSort.sort(copy, true);
                break;
        }

        System.out.print("---> Resultado final ordenado: ");
        SortingUtils.printArray(copy);
    }
}
