import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Queue;
import java.util.LinkedList;
//gotta understand it
class parenthesesValid2 {
    public List<String> removeInvalidParentheses(String s) {
        List<String> ans = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        q.add(s);
        visited.add(s);
        boolean found = false;
        while(!q.isEmpty()){
            String curr = q.poll();
            if(isValid(curr)){
                ans.add(curr);
                found = true;
            }
            if(found){
                continue;
            }
            for(int i = 0; i< curr.length(); i++){
                if(curr.charAt(i) != '(' && curr.charAt(i) != ')'){
                    continue;
                }
                String next = curr.substring(0,i) + curr.substring(i+1);
                if(!visited.contains(next)){
                    visited.add(next);
                    q.add(next);
                }
            }
        }
        return ans;
    }
    public boolean isValid(String s){
        int count = 0;
        for( int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='('){
                count++;
            }
            else if(s.charAt(i)==')'){
                count--;
            }
            if(count < 0){
                return false;
            }
        }
        return count == 0;
    }
}