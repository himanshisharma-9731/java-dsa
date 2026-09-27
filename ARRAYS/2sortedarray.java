class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int x= m + n;
        int c = 0;
        double[] n3 = new double[x];
        for(int i = 0 ; i < m; i++){
            n3[i] = nums1[i];
            c++;
        }
        for(int i = 0; i< n; i++){
            n3[c] = nums2[i];
            c++;
        }
        
            for(int i = 0; i < x; i++){
                for(int j= i + 1; j < x; j++){
                    if(n3[i]>n3[j]){
                             double temp = n3[i];
                             n3[i] = n3[j];
                             n3[j] = temp;
                    }                     
                }
            }
        
        int me = x/2;
        if(x%2==0){
            double m2 = n3[me-1]+n3[me];
            double medd = m2/2;
            return medd;
        }
        else{
            return n3[me];
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array 1:");
        int m = sc.nextInt();
        System.out.println("Enter the length of array 2:");
        int n = sc.nextInt();
        int[] n1 = new int[m];
        System.out.println("Enter the elements for array 1:");
        for(int i = 0; i < m; i++){
            n1[i]=sc.nextInt();
        }
        int[] n2 = new int[n];
        System.out.println("Enter the elements for array 2:");
        for(int i=0; i<n; i++){
            n2[i]= sc.nextInt();
        }
        double median =  findMedianSortedArrays(n1, n2);
        System.out.println("The median of the 2 arrays is "+median);
    }
}
