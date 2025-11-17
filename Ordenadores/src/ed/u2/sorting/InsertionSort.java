package ed.u2.sorting;

public final class InsertionSort {
    private static int movementCount = 0;

    public static void sort(int[] a) {
        sort(a, false);
    }

    public static void sort(int[] a, boolean trace) {
        if (a == null || a.length < 2) {
            return;
        }

        //El bucle comienza en 1 y el elemento 0 es el sub-arreglo ordenado
        for (int i = 1; i < a.length; i++) {
            int key = a[i]; // El elemento a insertar
            int j = i - 1;  // El último índice del sub-arreglo ordenado

            if (trace) {
                System.out.println("\n--- Pasada " + i + ": Insertando " + key + " ---");
            }

            while (j >= 0 && a[j] > key) {
                if (trace) {
                    System.out.println("   -> Moviendo " + a[j] + " de " + j + " a " + (j + 1));
                }
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;

            if (trace) {
                System.out.print("Resultado pasada: ");
                SortingUtils.printArray(a);
            }
        }
        if (trace) {
            System.out.println("-> Fin InsertionSort. Total Movimientos: " + movementCount);
        }
    }

    public static int getMovementCount() {
        return movementCount;
    }

    public static void setMovementCount(int movementCount) {
        InsertionSort.movementCount = movementCount;
    }
}