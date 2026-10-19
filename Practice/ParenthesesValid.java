
public class ParenthesesValid {
    public int minAddToMakeValid(String s) {
        int Copen = 0;
        int need = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                Copen++;
            }
            else{
                if(Copen > 0){
                    Copen--;
                }
                else{
                    need++;
                }
            }
        }
        return need + Copen;
    }
}

