public final class BubbleSort {

    public static void sort(int[] a) {
        sort(a, false);
    }

    public static void sort(int[] a, boolean trace) {
        if (a == null || a.length < 2) {
            return;
        }

        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            if (trace) {
                System.out.println("\n--- Pasada " + (i + 1) + " ---");
            }

            //Bucle interno para comparar y por cada pasada lleva el numero mas grande al final
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    if (trace) {
                        System.out.println("   -> Swap: " + a[j] + " <-> " + a[j + 1]);
                    }
                    // Usamos el helper para intercambiar
                    SortingUtils.swap(a, j, j + 1);
                    swapped = true;
                }
            }

            if (trace) {
                System.out.print("Resultado pasada: ");
                SortingUtils.printArray(a);
            }

            if (!swapped) {
                if (trace) {
                    System.out.println("Corte temprano: El arreglo ya está ordenado.");
                }
                break; // Salimos del bucle externo
            }
        }
    }
}