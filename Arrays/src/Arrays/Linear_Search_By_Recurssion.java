package Arrays;

public class Linear_Search_By_Recurssion {
static boolean search(int [] a,int target,int i) {
	if(i==a.length) {
		return false;
	}
//	if(a[a.length-1]==target) {
//		return true;
//	}
	else {
		return a[i]==target || search(a,target,i+1);
	}
}
public static void main(String[] args) {
	int [] a= {1,2,3,4,5};
	int target=5;
	System.out.println(search(a, target, 0));
}
}
