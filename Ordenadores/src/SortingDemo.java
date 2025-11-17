import java.util.Arrays;

public class SortingDemo {

    public static void main(String[] args) {
        System.out.println("***DEMO DE ALGORITMOS***");

        // Pruebas con Datasets
        runAllTestsFor("Dataset A [8, 3, 6, 3, 9]", SortingUtils.getDatasetA());
        runAllTestsFor("Dataset B [5, 4, 3, 2, 1] (Inverso)", SortingUtils.getDatasetB());
        runAllTestsFor("Dataset C [1, 2, 3, 4, 5] (Ordenado)", SortingUtils.getDatasetC());
        runAllTestsFor("Dataset D [2, 2, 2, 2] (Duplicados)", SortingUtils.getDatasetD());
        runAllTestsFor("Dataset E [9, 1, 8, 2]", SortingUtils.getDatasetE());

        // Pruebas con Casos Borde
        System.out.println("----- Pruebas con Casos Borde -----");
        runAllTestsFor("Caso: Arreglo Vacío []", SortingUtils.getCasoVacio());
        runAllTestsFor("Caso: Arreglo Tamaño 1 [42]", SortingUtils.getCasoTam1());
    }

    /**
     * Ejecuta los 3 algoritmos para un dataset específico
     */
    private static void runAllTestsFor(String testName, int[] originalArray) {
        System.out.println("=======================================================");
        System.out.println("PRUEBA: " + testName);
        System.out.print("Arreglo Original: ");
        SortingUtils.printArray(originalArray);
        System.out.println("-------------------------------------------------------");

        // --- InsertionSort ---
        System.out.println("-----------------InsertionSort----------------------");
        int[] copy1 = Arrays.copyOf(originalArray, originalArray.length);
        InsertionSort.sort(copy1, true); // con traza
        System.out.println("-> Resultado: " + InsertionSort.getMovementCount() + " movimientos.");
        System.out.print("Arreglo ordenado: ");
        SortingUtils.printArray(copy1);


        // --- SelectionSort ---
        System.out.println("-----------------SelectionSort-----------------");
        int[] copy2 = Arrays.copyOf(originalArray, originalArray.length);
        SelectionSort.sort(copy2, true); // con traza
        System.out.println("-> Resultado: " + SelectionSort.getSwapCount() + " swaps.");
        System.out.print("Arreglo ordenado: ");
        SortingUtils.printArray(copy2);


        // --- BubbleSort ---
        System.out.println("----------------Ejecutando BubbleSort----------------");
        int[] copy3 = Arrays.copyOf(originalArray, originalArray.length);
        BubbleSort.sort(copy3, true); // con traza
        System.out.println("-> Resultado: " + BubbleSort.getSwapCount() + " swaps.");
        System.out.print("Arreglo ordenado: ");
        SortingUtils.printArray(copy3);
    }
}