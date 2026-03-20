package com.nishant.dsa.utils;

import java.util.List;

/**
 * PrintUtils — Reusable printing/debugging helpers for DSA implementations.
 *
 * Instead of scattering System.out.println() all over our DS/algo code,
 * call these methods. Keeps our core logic clean and readable.
 *
 * Usage examples:
 *   PrintUtils.printArray(arr);
 *   PrintUtils.printMatrix(grid);
 *   PrintUtils.printLinkedList(head);
 */
public class PrintUtils {

    // ─────────────────────────────────────────────
    // ARRAYS
    // ─────────────────────────────────────────────

    /** Prints a 1D int array  →  [1, 2, 3, 4, 5] */
    public static void printArray(int[] arr) {
        if (arr == null) { System.out.println("null"); return; }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) sb.append(", ");
        }
        sb.append("]");
        System.out.println(sb);
    }

    /** Prints a 1D int array with a label  →  myArray: [1, 2, 3] */
    public static void printArray(String label, int[] arr) {
        System.out.print(label + ": ");
        printArray(arr);
    }

    /** Prints a 2D matrix (grid), row by row */
    public static void printMatrix(int[][] matrix) {
        if (matrix == null) { System.out.println("null"); return; }
        for (int[] row : matrix) {
            printArray(row);
        }
    }

    /** Prints a 2D matrix with a label */
    public static void printMatrix(String label, int[][] matrix) {
        System.out.println(label + ":");
        printMatrix(matrix);
    }

    // ─────────────────────────────────────────────
    // LIST
    // ─────────────────────────────────────────────

    /** Prints a List<Integer>  →  [10, 20, 30] */
    public static void printList(List<Integer> list) {
        if (list == null) { System.out.println("null"); return; }
        System.out.println(list);
    }

    /** Prints a List<Integer> with a label */
    public static void printList(String label, List<Integer> list) {
        System.out.print(label + ": ");
        printList(list);
    }

    // ─────────────────────────────────────────────
    // LINKED LIST
    // Requires a simple Node class: int val, Node next
    // ─────────────────────────────────────────────

    /**
     * Prints a singly linked list  →  1 -> 2 -> 3 -> null
     */
    public static void printLinkedList(com.nishant.dsa.datastructures.linkedlist.Node head) {
        com.nishant.dsa.datastructures.linkedlist.Node curr = head;
        StringBuilder sb = new StringBuilder();
        while (curr != null) {
            sb.append(curr.val).append(" -> ");
            curr = curr.next;
        }
        sb.append("null");
        System.out.println(sb);
    }

    // ─────────────────────────────────────────────
    // BINARY TREE
    // ─────────────────────────────────────────────

    /**
     * Prints a binary tree in In-Order (Left → Root → Right).
     * Useful for verifying BST correctness (should print sorted order).
     */
    public static void printTreeInOrder(com.nishant.dsa.datastructures.tree.TreeNode root) {
        if (root == null) return;
        printTreeInOrder(root.left);
        System.out.print(root.val + " ");
        printTreeInOrder(root.right);
    }

    // ─────────────────────────────────────────────
    // GENERAL
    // ─────────────────────────────────────────────

    /** Prints a separator line — useful between test case outputs */
    public static void separator() {
        System.out.println("─".repeat(40));
    }

    /** Prints a labeled section header */
    public static void header(String title) {
        System.out.println("\n===== " + title + " =====");
    }
}