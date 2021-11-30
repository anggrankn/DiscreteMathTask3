package ru.vsu.cs.grankina_a_v;

import ru.vsu.cs.grankina_a_v.sort.BubbleSort;
import ru.vsu.cs.grankina_a_v.sort.ShellSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int counter, number;
        int[] array;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        number = scanner.nextInt();
        array = new int[number];
        System.out.println("Введите " + number + " чисел");

        for (counter = 0; counter < number; counter++)
            array[counter] = scanner.nextInt();

        System.out.println();
        System.out.print("Массив до сортировки: ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();

        int[] arrayNew = array.clone();

        BubbleSort bubbleSort = new BubbleSort();
        ShellSort shellSort = new ShellSort();

        bubbleSort.bubbleSort(array);
        shellSort.shellSort(arrayNew);

        System.out.println("Массив после пузырьковой сортировки: " + Arrays.toString(arrayNew));
        System.out.println("Количество сравнений пузырьковой сортировки: " + bubbleSort.getIteration());
        System.out.println("Количество обменов пузырьковой сортировки: " + bubbleSort.getSwaps());
        System.out.println();
        System.out.println("Массив после сортировки Шелла: " + Arrays.toString(arrayNew));
        System.out.println("Количество сравнений сортировки Шелла: " + shellSort.getIteration());
        System.out.println("Количество обменов сортировки Шелла: " + shellSort.getSwaps());
    }
}
