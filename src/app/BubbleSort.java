package app;

public class BubbleSort {
    public static void main(String[] args) {
        //create an int array to sort using bubble sort
        int intArray[] = new int[]{5, 90, 35, 45, 150, 3};

        //print array before sorting
        System.out.println("Array before sorting...");
        printArray(intArray);

        //Sort using buble sort
        bubbleSort(intArray);

        System.out.println("Array after sorting...");
        printArray(intArray);
    }

    private static void printArray(int[] intArray) {
        for(int i = 0; i  < intArray.length; i++) {
            System.out.println(intArray[i]+" ");
        }
    }

    /**
     * Sorts an array using bubble sort
     * (N-1) times, each with a max of (N-1) swaps
     */
    public static void bubbleSort(int[] intArray) {
        int n = intArray.length;

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < (n-i-1); j++) {
                if (intArray[j] > intArray[j+1]) {
                    swapWithNext(intArray, j);
                }
            }
        }
    }

    /**
     * Swaps the value at index with the value at index+1
     * @param intArray The array that the swapping is taking place
     * @param index The place to swap
     */
    private static void swapWithNext(int[] intArray, int index) {
        int temp = intArray[index];
        intArray[index] = intArray[index+1];
        intArray[index+1] = temp;
    }
}