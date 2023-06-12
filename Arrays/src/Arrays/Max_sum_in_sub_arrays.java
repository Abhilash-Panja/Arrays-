package Arrays;
//http://surl.li/hxsld
public class Max_sum_in_sub_arrays {
static int SubArray_Sum(int a[]) {
	int sum=0;
	for(int i=0;i<a.length-1;i++) {
		sum=Math.max(sum, a[i]+a[i+1]);
	}
	return sum;
}
public static void main(String[] args) {
	int [] a= {1,2,3};
	System.out.println( SubArray_Sum( a));
}
}
