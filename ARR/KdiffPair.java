package ARR;

import java.util.HashMap;

public class KdiffPair {
    public int findPairs(int[] nums, int k) {
        if(k<0){
            return 0;
        }
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int count = 0;
        for(int x:nums){
            mpp.put(x,mpp.getOrDefault(x,0) + 1);            
        }
        for(int x: mpp.keySet()){
            if(k == 0){
                if(mpp.get(x) > 1){
                    count++;
                }
            }
            else{
                if(mpp.containsKey(x+k)){
                    count++;
                }
            }
        }
        return count;
    }
}

