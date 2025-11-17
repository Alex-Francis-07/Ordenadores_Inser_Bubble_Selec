package ed.u2.sorting;

import java.util.Arrays;

public final class SelectionSort {

    private static int swapCount = 0;

    private SelectionSort() {
    }

    public static void sort(int[] a) {
        sort(a, false);
    }

    public static int getSwapCount() {
        return swapCount;
    }

    public static void sort(int[] a, boolean trace) {
        swapCount = 0; // Reiniciar el contador

        if (a == null || a.length < 2) {
            if (trace) System.out.println("  -> Arreglo nulo o ya ordenado (tamaño < 2).");
            return;
        }

        if (trace) {
            System.out.println("  -> Inicio SelectionSort. Arreglo original: " + Arrays.toString(a));
        }

        int n = a.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j; // Encontramos un nuevo mínimo
                }
            }

            int minValue = a[minIndex]; // Guardamos valor para la traza

            if (trace) {
                System.out.println("\n--- Pasada " + (i + 1) + ": Buscando mínimo para la posición " + i + " ---");
                System.out.println("   -> Mínimo encontrado: " + minValue + " (en la posición " + minIndex + ")");
            }

            // Intercambiar SOLO si el mínimo no está ya en su lugar.
            if (minIndex != i) {
                if (trace) {
                    // a[minIndex] tendrá el valor de a[i] después del swap
                    System.out.println("   -> ¡SWAP! Intercambiando " + a[i] + " (en pos " + i + ") con " + a[minIndex] + " (en pos " + minIndex + ")");
                }
                SortingUtils.swap(a, i, minIndex);
                swapCount++; // Contar el swap
            } else {
                if (trace) {
                    System.out.println("   -> Ya estaba en su lugar. No hay swap.");
                }
            }

            if (trace) {
                System.out.print("Resultado pasada: ");
                SortingUtils.printArray(a);
            }
        }

        if (trace) {
            System.out.println("\n-> Fin SelectionSort. Total Swaps: " + swapCount);
        }
    }
}