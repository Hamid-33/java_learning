import java.util.Arrays;
public class array {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array elements using for loop:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);       
        }
        System.out.println("\n");
        System.out.println("Array elements using indexed access:");
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.binarySearch(array, 3));
        int array2[] = {1, 2, 3, 4, 5};
        System.out.println(Arrays.equals(array, array2));
        Arrays.fill(array2, 0);
        System.out.println(Arrays.toString(array2));
    }
}

