package ru.vsu.cs.grankina_a_v.sort;

public class ShellSort {
    private int iteration = 0;
    private int swaps = 0;

    public int getIteration() {
        return iteration;
    }

    public int getSwaps() {
        return swaps;
    }

    public void shellSort(int[] array) {
        int h = 1;
        while (h * 3 < array.length)
            h = h * 3 + 1;

        while (h >= 1) {
            hSort(array, h);
            h = h / 3;
        }
    }

    private void hSort(int[] array, int h) {
        int length = array.length;
        for (int i = h; i < length; i++) {
            for (int j = i; j >= h; j = j - h) {
                iteration++;
                if (array[j] < array[j - h]) {
                    swap(array, j, j - h);
                    swaps++;
                } else {
                    break;
                }
            }
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
