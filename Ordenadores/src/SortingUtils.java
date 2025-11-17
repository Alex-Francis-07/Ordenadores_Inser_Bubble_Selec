import java.util.Arrays;

public final class SortingUtils {

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void printArray(int[] a) {
        System.out.println(Arrays.toString(a));
    }
}