package Arrays;
//https://leetcode.com/problems/continuous-subarray-sum/
public class Continuous_Subarray_Sum {
static boolean checkSubarraySum(int[] a, int k) {
//	int n=elmentfound(a,k);
	if(a.length==1) {
		return a[0]==k;
	}
        if(elmentfound(a,k)) {
        	return true;
        }
        else {
        	
        	int i=0;
        	while(i<a.length){
        		int j=i+1;
        		if(j<a.length &&a[i]+a[j] % k == 0) {
        			return true;
        		}
        		else {
        		i++;
        	}}
        }
        return false;
    }
static boolean elmentfound(int [] a,int k) {
	int sum=0;
	for(int i=0;i<a.length;i++) {
		sum=0;
		for(int j=i;j<a.length;j++) {
			sum+=a[j];
			if(sum%k==0) {
				return true;
			}
		}
//		if(a[i]==k) {
//			return true;
//		}
		
		
	}
	return false;
}
public static void main(String[] args) {
	int [] a= {0};
			
	int k=13;
	System.out.println(checkSubarraySum(a, k));
}
}
