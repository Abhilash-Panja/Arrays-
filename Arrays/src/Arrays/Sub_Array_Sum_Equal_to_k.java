package Arrays;

public class Sub_Array_Sum_Equal_to_k {
/*static	int subarraySum(int[] a, int k) {
	int sum=0;
	int c=0;
	if(AscendingBinarySearch(a,k)) {
		c++;
	}
	for(int i=0;i<a.length;i++) {
		sum+=a[i];
		a[i]=sum;
	}
	for(int i=0;i<a.length;i++) {
		if(a[i]==k) {
			c++;
		}
		else if(i+1<a.length && a[i+1]-a[i]==1) {
			c++;
		}
	}
	return c;
	}
static boolean AscendingBinarySearch(int [] a,int target) {
	int start=0;
	int end=a.length-1;
	while(start<=end) {
		int mid=start+(end-start)/2;
		if(target>a[mid]) {
			start=mid+1;
		}
		else if(target < a[mid]) {
			end=mid-1;
		}
		else {
			return true;
		}
	}
	return false;
}
*/
	static	int subarraySum(int[] a, int k) {
		
		int c=0;
		for(int i=0;i<a.length;i++) {
			int sum=0;
			for(int j=i;j<a.length;j++) {
				sum+=a[j];
				if(sum==k) {
					c++;
				}
			}
		}
		return c;
	}
	
	static int SubarraySum(int [] a,int k) {
		int c=0;
		int i=0,j=0;
		int sum=0;
		while(j<a.length) {
			sum+=a[j];
			if(sum==k) {
				c++;
				j++;
				sum=0;
			}
			if(sum>k) {
				i++;
			}
			else {
				j++;
			}
		}
		return c;
	}
	
	
	
public static void main(String[] args) {
	int [] a= {1,2,3};
	int k=3;
	System.out.println(subarraySum(a,  k) );
}
}
