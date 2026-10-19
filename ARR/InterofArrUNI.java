import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterofArrUNI {
  
    public int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i = 0, j = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                if(list.size() == 0 || list.get(list.size()-1) != nums1[i])
                 {  list.add(nums1[i]); }
                i++; j++;
            }
        }
        int[] res = new int[list.size()];
        for (int k = 0; k<list.size(); k++){
            res[k] = list.get(k);
        }
        return res;
    }

}
