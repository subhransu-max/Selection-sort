import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 1};
        int start = 0;
        
        for (int i = 0; i < arr.length; i++) {
            int maxIndex = max(arr, start, arr.length - i );
            swap(arr, maxIndex, arr.length - i - 1);
        }
        
        System.out.println(Arrays.toString(arr));
    }

    static int max(int[] arr, int start, int end) {
        int maximum = start;
        for (int i = start + 1; i < end; i++) {
            if (arr[i] > arr[maximum]) {
                maximum = i;
            }
        }
        return maximum;
    }

    static void swap(int[] arr, int max, int end) {
        int temp = arr[max];
        arr[max] = arr[end];
        arr[end] = temp;
    }
}
