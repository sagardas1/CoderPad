public class MaxDif {
    public static int maximumDifference(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    if(nums[j]-nums[i]>max){
                        max=nums[j]-nums[i];
                    }
                }
            }
        }
        if(max==0){return -1;}
        return max;
    }
}

