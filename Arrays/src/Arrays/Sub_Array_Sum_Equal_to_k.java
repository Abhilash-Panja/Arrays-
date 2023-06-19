package Arrays;
import java.util.*;
public class Sub_Array_Sum_Equal_to_k {
/*static	int subarraySum(int[] a, int k) {
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
	
	*/
	
	static	int subarraySum(int[] a, int k) {
		HashMap<Integer,Integer> map=new HashMap<>();
		int sum=0;
		int c=0;
		map.put(0, 1);
		for(int i=0;i<a.length;i++) {
			sum+=a[i];		
			if(map.containsKey(sum-k)) {
				c+=map.get(sum-k);
			}
			map.put(sum, map.getOrDefault(sum, 0)+1);
			
		}
		return c;
	}
public static void main(String[] args) {
	int [] a= {15,-2,2,-8,1,7,10,23};
	int k=0;
	System.out.println(subarraySum(a,  k) );
}
}
