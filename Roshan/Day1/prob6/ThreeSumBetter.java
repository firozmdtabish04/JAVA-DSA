package Day1.prob6;

import java.util.*;

public class ThreeSumBetter {
    public static List<List<Integer>> threeSum(int[] nums){
        Set<List<Integer>> ans=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int third=-(nums[i]+nums[j]);
                if(set.contains(third)){
                    List<Integer> temp=Arrays.asList(nums[i],nums[j],third);
                    Collections.sort(temp);
                    ans.add(temp);
                }
                set.add(nums[j]);
            }
        }

        return new ArrayList<>(ans);
    }
}
    

