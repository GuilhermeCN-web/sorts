public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = {8, 4, 1, 3, 9, 5};

        System.out.println("Original array:");
        printArray(numbers);

        insertionSort(numbers);

        System.out.println("Sorted array:");
        printArray(numbers);
    }

    public static void insertionSort(int[] array) {
        int length = array.length;

        for (int i = 1; i < length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }
    }

    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
