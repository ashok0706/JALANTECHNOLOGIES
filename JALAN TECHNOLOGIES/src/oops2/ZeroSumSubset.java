package oops2;

import java.util.ArrayList;

public class ZeroSumSubset {
    public static ArrayList<Integer> findZeroSumCombination(int[] arr) {
        ArrayList<Integer> subset = new ArrayList<>();
        int n = arr.length;

        // Generate all possible subsets of the array
        for (int i = 1; i < (1 << n); i++) {
            subset.clear();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    subset.add(arr[j]);
                }
            }
            int sum = 0;
            for (int num : subset) {
                sum += num;
            }
            if (sum == 0) {
                return subset;
            }
        }

        return new ArrayList<>(); 
    }

    public static void main(String[] args) {
        int[] inputArray = {-4, 1, 3, -2, -1};
        ArrayList<Integer> result = findZeroSumCombination(inputArray);

        if (result.isEmpty()) {
            System.out.println("No Elements found");
        } else {
            System.out.println(result);
        }
    }
}
