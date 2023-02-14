class Solution {
    public int differenceOfSum(int[] nums) {
        int a=0;
        int b=0;
        for(int i=0;i<nums.length;i++){
            a+=nums[i];
            if(nums[i]<10){
                b+=nums[i];
            }else{
                b+=isArmstrong(nums[i]);
            }

        }
        System.out.println(a);
        System.out.println(b);

        return Math.abs(a-b);
    }


    static int isArmstrong(int n) {
        int temp, digits = 0, last = 0, sum = 0;
        System.out.println("digit--->>"+n);
        temp = n;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = n;
        while (temp > 0) {
            last = temp % 10;
            sum += last;
            temp = temp / 10;
        }
        System.out.println("digit--->>"+n+" sum--->>>"+sum);
        return  sum;
    }
}