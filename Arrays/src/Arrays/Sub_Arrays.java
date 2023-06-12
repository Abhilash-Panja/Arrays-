package Arrays;
import java.util.*;
public class Sub_Arrays {
static ArrayList subArray(int [] a) {
	ArrayList<ArrayList <Integer>> l=new ArrayList<>();
	for(int i=0;i<a.length;i++) {
		for(int j=i;j<a.length;j++) {
			ArrayList<Integer> l1=new ArrayList<>();
			for(int k=i;k<=j;k++) {
				l1.add(a[k]);
				
			}
			l.add(l1);
		}
	}
	return l;
}
public static void main(String[] args) {
	int [] a= {1,2,3};
	System.out.println(subArray( a));
}
}
