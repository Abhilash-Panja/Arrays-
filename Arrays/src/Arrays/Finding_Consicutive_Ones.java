package Arrays;
//https://leetcode.com/problems/max-consecutive-ones/submissions/
public class Finding_Consicutive_Ones {
static int findMaxConsecutiveOnes(int[] a) {
       int currentcount=0;
       int maxcount=0;
       for(int i=0;i<a.length;i++) {
    	   if(a[i]==1) {
    		   currentcount++;
    		   maxcount=Math.max(maxcount, currentcount);
    	   }
    	   else if(a[i]!=1) {
    		   currentcount=0;
    	   }
       }
       return maxcount;
    }
public static void main(String[] args) {
	int [] a= {1,1,0,1,1,1};
	System.out.println(findMaxConsecutiveOnes( a));
}
}
