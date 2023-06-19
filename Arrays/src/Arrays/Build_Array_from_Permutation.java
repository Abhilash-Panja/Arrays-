package Arrays;

import java.util.Arrays;

public class Build_Array_from_Permutation {
	static int[] buildArray(int[] a) {
//	    int [] ans=new int [a.length];
//	    for(int i=0;i<a.length;i++) {
//	    	ans[i]=a[a[i]];
//	    }
//	    return ans;
//	    }
		
/*Manam oka variable lo rendu numbers ne store chayavachu
 ie a , b are two numbers logic to store
 and x lo store chastham
 x=a+(b%n)*n
 
 
 */		
		
		for(int i=0;i<a.length;i++) {
		 a[i]=a[i]+(a[a[i]]%a.length) *a.length;
		}
		for(int i=0;i<a.length;i++) {
			a[i]=a[i]/a.length;
		}
		return a;
	}
	public static void main(String[] args) {
		int [] a= {0,2,1,5,3,4};
		System.out.println(Arrays.toString(buildArray( a)));
		}
}
