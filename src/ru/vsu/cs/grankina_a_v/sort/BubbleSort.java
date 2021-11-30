package ru.vsu.cs.grankina_a_v.sort;

public class BubbleSort {

    private int iteration = 0;
    private int swaps = 0;

    public int getIteration() {
        return iteration;
    }
    public int getSwaps() {
        return swaps;
    }

    public void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    swaps++;
                }
                iteration++;
            }
        }
    }
}
