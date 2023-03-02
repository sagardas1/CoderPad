import java.util.*;

public class KeepMultiplying {

    public int findFinalValue(int[] nums, int original) {
        List<Integer> list = new ArrayList<>();
        int k = original;
        for (int i : nums) {
            list.add(i);
        }

        while (list.contains(k)) {
            k = k * 2;
        }


        return k;
    }



    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (i >= 0 && j > i && k > j && Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                        count += 1;
                    }
                }

            }
        }
        return count;
    }
}
