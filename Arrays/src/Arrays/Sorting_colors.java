package Arrays;

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
	public static void main(String[] args) {
	int [] a= {2,0,2,1,1,0};
	sorting(a);
	for(int i: a) {
		System.out.print(i+" ");
	}
	}
}
