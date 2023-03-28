public class CountPairs {
    public static int countPairs(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && (i * j) % k == 0) {
                    count += 1;
                }
            }

        }
        if (count == 0) return 0;
        return count;


    }



    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        System.out.println(countPairs(a, 1));
    }
}
