package main.java.cli;

import main.java.algorithms.BoyerMoore;
import java.util.Random;

public class BenchmarkRunner {
    public static void main(String[] args) {
        int n = 100000; // Размер массива по умолчанию
        if (args.length > 0) {
            try {
                n = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Using default size 10000.");
            }
        }

        int[] arr = generateArray(n);
        BoyerMoore bm = new BoyerMoore();

        long startTime = System.nanoTime();
        Integer result = bm.findMajorityElement(arr);
        long endTime = System.nanoTime();

        System.out.println("\nArray size: " + n);
        System.out.println("Majority Element: " + (result != null ? result : "None"));
        System.out.printf("Execution Time: %.4f ms%n", (endTime - startTime) / 1e6);
        bm.getTracker().printMetrics();
    }

    private static int[] generateArray(int n) {
        Random rand = new Random();
        int[] arr = new int[n];

        // 50% элементов — одно и то же число, чтобы был мажоритарный элемент
        int majorityValue = rand.nextInt(10);
        for (int i = 0; i < n; i++) {
            arr[i] = (i < n / 2 + rand.nextInt(n / 4)) ? majorityValue : rand.nextInt(10);
        }
        return arr;
    }
}
