package org.syspar.tests;

import java.util.HashMap;
import java.util.Map;

/*
Problem:    Given an array of integers, return indices of the two numbers such that they add to specific target.
            You may assume that each input would have only one solution, and you may not use the same number twice.
*/
public class TwoSum {

    public static int[] findTwoSumIndices(int[] arr, int target) {

        Map<Integer, Integer> visitedNumbers = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int delta = target - arr[i];

            if (visitedNumbers.containsKey(delta)) {
                return new int[] { i, visitedNumbers.get(delta) };
            } else {
                visitedNumbers.put(arr[i], i);
            }
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        System.out.println("Hello TwoSum");

        int[] arr = new int[] { 2, 5, 7, 9, 15 };
        int[] result = findTwoSumIndices(arr, 9);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}