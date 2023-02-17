public class AvgValueDivisibleBy3 {


    public static void main(String[] args) {

        int[] i = {0};
        System.out.println(averageValue(i));
    }

    public static int averageValue(int[] nums) {
        int count = 0;
        int sum = 0;


        for (int i : nums) {
            if (i % 2 == 0 && i % 3 == 0) {
                count += 1;
                sum += i;
            }
        }
        if (count == 0) {
            return 0;
        }

        return sum / count;


    }
}

