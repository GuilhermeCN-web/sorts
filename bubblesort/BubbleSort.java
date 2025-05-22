public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};

        System.out.println("Original array:");
        printArray(numbers);

        bubbleSort(numbers);

        System.out.println("Sorted array:");
        printArray(numbers);
    }

    public static void bubbleSort(int[] array) {
        int length = array.length;
        boolean swapped;

        for (int i = 0; i < length - 1; i++) {
            swapped = false;

            for (int j = 0; j < length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) {
                break;
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
