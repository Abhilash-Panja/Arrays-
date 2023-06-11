package Arrays;

import java.util.Arrays;

public class Removing_Duplictaes {
static int removeDuplicates(int [] a) {
	int j=0;
	for(int i=0;i<a.length;i++) {
		if(a[j]!=a[i]) {
			a[++j]=a[i];
		}
	
	}
	display(a,j+1);
	return j+1;
}
	static void display(int[] a, int j) {
	for(int i=0;i<j;i++) {
		System.out.print(a[i]+" ");
	}
	
}
	public static void main(String[] args) {
		int [] a= {1,1,2};
		int b=removeDuplicates( a);
		System.out.print(b);
	}
}
