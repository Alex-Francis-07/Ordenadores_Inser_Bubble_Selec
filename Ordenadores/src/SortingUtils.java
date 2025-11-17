import java.util.Arrays;

    public final class SortingUtils {

        private SortingUtils() {
        }

        /**
         * Intercambia dos elementos en un arreglo.
         * @param a El arreglo.
         * @param i El índice del primer elemento.
         * @param j El índice del segundo elemento.
         */
        public static void swap(int[] a, int i, int j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        /**
         * Imprime un arreglo en la consola.
         */
        public static void printArray(int[] a) {
            if (a == null) {
                System.out.println("(null)");
                return;
            }
            System.out.println(Arrays.toString(a));
        }

        // --- Métodos para obtener los Datasets

        public static int[] getDatasetA() {
            return new int[]{8, 3, 6, 3, 9};
        }

        public static int[] getDatasetB() {
            return new int[]{5, 4, 3, 2, 1}; // Inverso
        }

        public static int[] getDatasetC() {
            return new int[]{1, 2, 3, 4, 5}; // Ya ordenado
        }

        public static int[] getDatasetD() {
            return new int[]{2, 2, 2, 2}; // Duplicados
        }

        public static int[] getDatasetE() {
            return new int[]{9, 1, 8, 2};
        }

        // --- Métodos para Casos Borde

        public static int[] getCasoVacio() {
            return new int[0];
        }

        public static int[] getCasoTam1() {
            return new int[]{42};
        }
    }