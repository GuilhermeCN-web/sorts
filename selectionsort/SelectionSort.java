public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {29, 10, 14, 37, 14};

        System.out.println("Original array:");
        printArray(numbers);

        selectionSort(numbers);

        System.out.println("Sorted array:");
        printArray(numbers);
    }

    public static void selectionSort(int[] array) {
        int length = array.length;

        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
