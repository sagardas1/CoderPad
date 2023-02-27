import java.util.*;

public class KeepMultiplying {

        public int findFinalValue(int[] nums, int original) {
            List<Integer> list=new ArrayList<>();
            int k=original;
            for(int i:nums){list.add(i);}

            while(list.contains(k)){
                k=k*2;
            }

            return k;
        }
}
