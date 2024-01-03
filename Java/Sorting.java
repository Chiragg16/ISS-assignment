import java.util.Arrays;

public class Sorting {
    
    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    // Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    
    // Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    
    // Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }
    
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 12, 1, 6, 3, 9};
        
        // Bubble Sort
        int[] bubbleSortArr = Arrays.copyOf(arr, arr.length);
        bubbleSort(bubbleSortArr);
        System.out.println("Bubble Sort: " + Arrays.toString(bubbleSortArr));
        
        // Selection Sort
        int[] selectionSortArr = Arrays.copyOf(arr, arr.length);
        selectionSort(selectionSortArr);
        System.out.println("Selection Sort: " + Arrays.toString(selectionSortArr));
        
        // Insertion Sort
        int[] insertionSortArr = Arrays.copyOf(arr, arr.length);
        insertionSort(insertionSortArr);
        System.out.println("Insertion Sort: " + Arrays.toString(insertionSortArr));

        // Quick Sort
        int[] quickSortArr = Arrays.copyOf(arr, arr.length);
        quickSort(quickSortArr, 0, quickSortArr.length - 1);
        System.out.println("Quick Sort: " + Arrays.toString(quickSortArr));
        
 
    }
}
