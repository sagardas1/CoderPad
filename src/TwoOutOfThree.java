import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class TwoOutOfThree {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        List<Integer> l1 = Arrays.stream(nums1)
                .boxed()
                .collect(Collectors.toList());
        List<Integer> l2 = Arrays.stream(nums2)
                .boxed()
                .collect(Collectors.toList());
        List<Integer> l3 = Arrays.stream(nums3
                )

                .boxed()




                .collect(Collectors.toList());








        Set<Integer> set = new HashSet<>();






        List<Integer> finalCount = new ArrayList<>();


        for (int i : nums1) {
            set.add(i);

        }
        for (int i : nums2) {
            set.add(i);
        }
        for (int i : nums3) {
            set.add(i);
        }
        for (int i : set) {
            int count = 0;
            if (l1.contains((Object) i)) {
                count += 1;
            }
            if (l2.contains((Object) i)) {
                count += 1;
            }
            if (l3.contains((Object) i)) {
                count += 1;
            }
            if (count >= 2) {
                finalCount.add(i);
            }


        }



        return finalCount;
    }
}




