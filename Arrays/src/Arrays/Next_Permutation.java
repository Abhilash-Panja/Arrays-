package Arrays;
//https://leetcode.com/problems/next-permutation/
import java.util.*;
public class Next_Permutation {
static void nextPermutation(int[] a) {
	int index=-1;
   for(int i=a.length-1;i>=0;i--) {
	   if(i > 0 && a[i]>a[i-1]) {
		 index=i-1;
		 break;
	   }
   } 
   if(index==-1) {
	   TwoPointer(a,0,a.length-1);
	   return;
   }
   for(int i=a.length-1;i>=index+1;i--) {
	   if(a[i]>a[index]) {
		  swap(a,i,index); 
		  break;
	   } 
   }
   
   TwoPointer(a,index+1,a.length-1); 
}

 static void swap(int[] a, int i, int index) {
	int temp=a[i];
	a[i]=a[index];
	a[index]=temp;
	
}
 static void TwoPointer(int [] a,int start,int end) {
	 while(start<end) {
			int temp=a[start];
			 a[start]=a[end];
			 a[end]=temp;
			 start++;
			 end--;
		}
	 }
 
 public static void main(String[] args) {
	int [] a= {1,3,2};
	nextPermutation( a);
	//Sort(a,0,3);
	System.out.println(Arrays.toString(a));
}
 }

