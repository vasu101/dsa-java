package com.nishant.dsa.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * InputUtils — Generate test inputs on the fly for DSA practice.
 *
 * When we're implementing an algorithm and need a quick test array,
 * call these instead of hardcoding data every time.
 *
 * Usage examples:
 *   int[] arr   = InputUtils.randomIntArray(10);
 *   int[] sorted = InputUtils.sortedArray(10);
 *   int[][] grid = InputUtils.randomMatrix(3, 3);
 */
public class InputUtils {

    private static final Random RANDOM = new Random();

    // ─────────────────────────────────────────────
    // INT ARRAYS
    // ─────────────────────────────────────────────

    /**
     * Returns a random int array of given size.
     * Values are in range [0, 100].
     *
     * Example: randomIntArray(5)  →  [42, 7, 91, 3, 55]
     */
    public static int[] randomIntArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = RANDOM.nextInt(101); // 0 to 100
        }
        return arr;
    }

    /**
     * Returns a random int array with values in custom range [min, max].
     *
     * Example: randomIntArray(5, -10, 10)  →  [-3, 7, 0, -8, 5]
     */
    public static int[] randomIntArray(int size, int min, int max) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = min + RANDOM.nextInt(max - min + 1);
        }
        return arr;
    }

    /**
     * Returns a sorted ascending array: [1, 2, 3, ..., size]
     * Great for testing binary search.
     */
    public static int[] sortedArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = i + 1;
        return arr;
    }

    /**
     * Returns a reverse-sorted array: [size, size-1, ..., 1]
     * Worst case for some sorting algorithms.
     */
    public static int[] reverseSortedArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = size - i;
        return arr;
    }

    /**
     * Returns an array with all duplicate values.
     * Example: allSameArray(4, 7)  →  [7, 7, 7, 7]
     */
    public static int[] allSameArray(int size, int value) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = value;
        return arr;
    }

    // ─────────────────────────────────────────────
    // LIST
    // ─────────────────────────────────────────────

    /**
     * Returns a shuffled List<Integer> with values [1..size].
     * Good for testing sort algorithms.
     */
    public static List<Integer> shuffledList(int size) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= size; i++) list.add(i);
        Collections.shuffle(list);
        return list;
    }

    // ─────────────────────────────────────────────
    // 2D MATRIX
    // ─────────────────────────────────────────────

    /**
     * Returns a rows×cols matrix filled with random values [0, 9].
     * Useful for grid-based problems (DFS, BFS, pathfinding).
     */
    public static int[][] randomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = RANDOM.nextInt(10);
        return matrix;
    }

    /**
     * Returns a rows×cols matrix filled entirely with a given value.
     * Example: filledMatrix(3, 3, 0)  →  3×3 zero grid
     */
    public static int[][] filledMatrix(int rows, int cols, int value) {
        int[][] matrix = new int[rows][cols];
        for (int[] row : matrix)
            java.util.Arrays.fill(row, value);
        return matrix;
    }

    // ─────────────────────────────────────────────
    // STRINGS
    // ─────────────────────────────────────────────

    /**
     * Returns a random lowercase string of given length.
     * Useful for string algorithm problems.
     */
    public static String randomString(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append((char) ('a' + RANDOM.nextInt(26)));
        }
        return sb.toString();
    }
}