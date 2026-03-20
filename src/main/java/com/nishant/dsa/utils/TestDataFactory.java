package com.nishant.dsa.utils;

/**
 * TestDataFactory — Fixed, deterministic test cases for DSA problems.
 *
 * Unlike InputUtils (which generates random data), this class provides
 * hardcoded inputs with KNOWN correct outputs. Use these in your
 * JUnit tests or just to quickly verify your implementations.
 *
 * Each method is named after the algorithm/problem it's designed for.
 * The expected output is always documented in the Javadoc.
 */
public class TestDataFactory {

    // ─────────────────────────────────────────────
    // SORTING / SEARCHING
    // ─────────────────────────────────────────────

    /**
     * Standard unsorted array for testing sort algorithms.
     * Expected after sort (asc): [1, 2, 3, 5, 6, 8, 9]
     */
    public static int[] getUnsortedArray() {
        return new int[]{5, 3, 8, 1, 9, 2, 6};
    }

    /**
     * Sorted array for testing Binary Search.
     * Target 7  →  index 3
     * Target 99 →  -1 (not found)
     */
    public static int[] getBinarySearchArray() {
        return new int[]{1, 3, 5, 7, 9, 11, 13};
    }

    // ─────────────────────────────────────────────
    // ARRAY PROBLEMS
    // ─────────────────────────────────────────────

    /**
     * Classic Kadane's Algorithm (Maximum Subarray) test case.
     * Expected max subarray sum: 6  (subarray: [4, -1, 2, 1])
     */
    public static int[] getKadaneTestCase() {
        return new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
    }

    /**
     * Two Sum test case.
     * Target: 9
     * Expected result: indices [0, 1]  (2 + 7 = 9)
     */
    public static int[] getTwoSumArray() {
        return new int[]{2, 7, 11, 15};
    }

    public static int getTwoSumTarget() {
        return 9;
    }

    /**
     * Array with duplicates — useful for Two Pointer / Sliding Window problems.
     * E.g. longest subarray without repeating elements = 3  ("abc" or "bca")
     */
    public static int[] getDuplicatesArray() {
        return new int[]{1, 2, 1, 3, 2, 4};
    }

    /**
     * Stock prices array for "Best Time to Buy and Sell Stock".
     * Expected max profit: 5  (buy at 1, sell at 6)
     */
    public static int[] getStockPrices() {
        return new int[]{7, 1, 5, 3, 6, 4};
    }

    // ─────────────────────────────────────────────
    // MATRIX / 2D GRID
    // ─────────────────────────────────────────────

    /**
     * 3×3 grid for DFS / BFS island problems.
     *
     * Grid:
     *   1 1 0
     *   1 0 0
     *   0 0 1
     *
     * Number of islands (connected 1s): 2
     */
    public static int[][] getIslandGrid() {
        return new int[][]{
                {1, 1, 0},
                {1, 0, 0},
                {0, 0, 1}
        };
    }

    /**
     * 3×3 matrix for spiral order / rotation problems.
     *
     * Grid:
     *   1 2 3
     *   4 5 6
     *   7 8 9
     *
     * Spiral order: [1, 2, 3, 6, 9, 8, 7, 4, 5]
     */
    public static int[][] getSpiralMatrix() {
        return new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
    }

    // ─────────────────────────────────────────────
    // STRINGS
    // ─────────────────────────────────────────────

    /**
     * Classic anagram pair.
     * "anagram" and "nagaram" are anagrams → true
     */
    public static String[] getAnagramPair() {
        return new String[]{"anagram", "nagaram"};
    }

    /**
     * Classic palindrome check strings.
     * isPalindrome[0] = "racecar" → true
     * isPalindrome[1] = "hello"   → false
     */
    public static String[] getPalindromeStrings() {
        return new String[]{"racecar", "hello"};
    }

    // ─────────────────────────────────────────────
    // STACK / QUEUE
    // ─────────────────────────────────────────────

    /**
     * Valid parentheses test strings.
     * validParentheses[0] = "(())" → valid (true)
     * validParentheses[1] = "([)]" → invalid (false)
     * validParentheses[2] = "{[]}" → valid (true)
     */
    public static String[] getParenthesesCases() {
        return new String[]{"(())", "([)]", "{[]}"};
    }

    // ─────────────────────────────────────────────
    // LINKED LIST
    // ─────────────────────────────────────────────

    /**
     * Values to build a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
     * Use with your Node class to construct the list.
     */
    public static int[] getLinkedListValues() {
        return new int[]{1, 2, 3, 4, 5};
    }

    // ─────────────────────────────────────────────
    // DYNAMIC PROGRAMMING
    // ─────────────────────────────────────────────

    /**
     * Coin change denominations and amount.
     * coins  = [1, 5, 6, 9]
     * amount = 11
     * Min coins needed: 2  (5 + 6)
     */
    public static int[] getCoinChangeCoins() {
        return new int[]{1, 5, 6, 9};
    }

    public static int getCoinChangeAmount() {
        return 11;
    }

    /**
     * Classic 0/1 Knapsack test case.
     * weights  = [2, 3, 4, 5]
     * values   = [3, 4, 5, 6]
     * capacity = 8
     * Max value: 10  (items with weight 3 + 5)
     */
    public static int[] getKnapsackWeights() {
        return new int[]{2, 3, 4, 5};
    }

    public static int[] getKnapsackValues() {
        return new int[]{3, 4, 5, 6};
    }

    public static int getKnapsackCapacity() {
        return 8;
    }
}