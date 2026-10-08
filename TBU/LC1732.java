package TBU;
public class LC1732 {  
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] points = new int[n+1];
        int s = 0;
        for(int i = 0 ; i < points.length; i++){
            if(i == 0){
                points[i] = 0;

            }
            else{
                points[i] = points[i-1] + gain[i-1];
            }
        }
        int highest = MaxEle(points);
        return highest;
    }
    public static int MaxEle(int[] a){
        int maximum = a[0];
        for(int i = 1; i< a.length; i++){
            maximum = Math.max(maximum, a[i]);
        }
        return maximum;
    } 
}
