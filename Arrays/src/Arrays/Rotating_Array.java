package Arrays;
//https://leetcode.com/problems/rotate-array/
import java.util.Arrays;

public class Rotating_Array {
//brute force O(n*k)
static void rrotate(int [] a,int k) {
	for(int j=0;j<k;j++) {
	int temp=a[a.length-1];
	for(int i=a.length-1;i>0;i--) {
		a[i]=a[i-1];
	}
	a[0]=temp;
}}
	
//optimized code O(n)	
static void rotate(int [] a,int k) {
	//k=k%a.length;
	reverse(a,0,a.length-1);
	reverse(a,0,k-1);
	reverse(a,k,a.length-1);
}
 static void reverse(int[] a, int start, int end) {
	while(start<end) {
		int temp=a[start];
		a[start]=a[end];
		a[end]=temp;
		start++;
		end--;
	}
	
}
 static void oneRotation(int []a,int i,int n) {
	 int temp=a[a.length-1];
	 for(int i1=a.length-1;i1>0;i1--) {
			a[i1]=a[i1-1];
		}
		a[0]=temp;
 }
 
 static void Rotate(int [] a,int k) {
	 for(int i=0;i<k;i++) {
		 oneRotation(a,0,a.length-1);
	 }
 }
 
 
 
 
 
 
 
 
public static void main(String[] args) {
	int [] a= {1,2,3,4,5,6,7};
	rotate( a, 3);
	System.out.println(Arrays.toString(a));
}
}
