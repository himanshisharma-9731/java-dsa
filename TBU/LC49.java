package TBU;
import java.util.*;

class LC49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];

            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
            }

            StringBuilder key = new StringBuilder();

            for (int x : count) {
                key.append(x).append('#');
            }

            String k = key.toString();

            map.putIfAbsent(k, new ArrayList<>());
            map.get(k).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {

//        HashMap<String,List<String>> map = new HashMap<>();

//        for(String str : strs)
//        {
//         char[] strArray = str.toCharArray();

//         Arrays.sort(strArray);

//         String sortedStr = new String(strArray);

//         if(!map.containsKey(sortedStr))
//         {
//             map.put(sortedStr,new ArrayList<>());
//         }

//         map.get(sortedStr).add(str);
//        }
//         return new ArrayList<>(map.values());
//     }
// }