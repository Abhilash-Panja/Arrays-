package Arrays;

import java.util.HashMap;

public class Largest_SubArray_with_Zero {
	static	int subarraySum(int[] a, int k) {
		HashMap<Integer,Integer> map=new HashMap<>();
		int sum=0;
		int length=0;
		//map.put(0, 1);
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
			if(sum==0) {
				length=i+1;
			}
			else {
				if(map.containsKey(sum)) {
					length=Math.max(i-map.get(sum), length);
				}
				else {
				map.put(sum, i);}
			}
			
			
		}
		return length;
	}
	public static void main(String[] args) {
	    int[] a = {1,-1,3,2,-2,-8,1,7,10,23};
	    int k = 0;
	    System.out.println(subarraySum(a, k));
	}
}
