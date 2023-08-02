public class App {
    public static void main(String[] args) throws Exception {

        int[] array = {3, 1, 0, 2, 7, 5};
        System.out.println("\nМассив до сортировки: ");
        printArray(array);
        System.out.println("\n\nМассив после сортировки: ");
        heapifySort(array);
        System.out.println("\n");

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


    public static void heapifySort(int[] array) {

        for (int i = array.length / 2 - 1; i >= 0 ; i--) {
            heapify(array, array.length, i);
        }

        for (int i = array.length - 1; i >= 0 ; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
            System.out.print(array[i] + " ");
        }
    }

    public static void heapify(int[] array, int heapSize, int rootIndex)
    {
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        if (leftChild < heapSize && array[leftChild] > array[largest]) {
            largest = leftChild;
        }

        if (rightChild < heapSize && array[rightChild] > array[largest]) {
            largest = rightChild;
        }

        if (largest != rootIndex) {
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;

            heapify(array, heapSize, rootIndex);
        }

    }
}
