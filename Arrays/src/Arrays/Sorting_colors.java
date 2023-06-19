package Arrays;
import java.util.*;
public class Sorting_colors {
	static void sorting(int [] a) {
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length-i;j++) {
				if(a[j-1]>a[j]) {
				   temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
	}
//	static void swap(int [] a,int i, int correctposition) {
//		int temp=a[i];
//		a[i]=a[correctposition];
//		a[correctposition]=temp;
//		
//	}
	static void Sorting(int [] a) {
		int low=0,high=a.length-1,mid=0;
		while(mid<=high) {
			switch(a[mid]) {
			case 0:{
				swap(a,low,mid);
				low++;
				mid++;
				break;}
			case 1:{
				mid++;
				break;}
			case 2:{
				swap(a,mid,high);
				mid++;
				high--;
				break;}
			}
			
				
		}
	}
	 static void swap(int[] a, int low, int mid) {
		int temp=a[low];
		a[low]=a[mid];
		a[mid]=temp;
		
	}
	public static void main(String[] args) {
	int [] a= {2,0,1};
	Sorting(a);
	System.out.println(Arrays.toString(a));
	}
}
