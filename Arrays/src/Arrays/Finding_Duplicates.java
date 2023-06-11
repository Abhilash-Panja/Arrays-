package Arrays;

public class Finding_Duplicates {
 static int findDuplicate(int[] nums) {
     sort(nums);
     for(int i=0;i<nums.length;i++) {
    	 if(i!=nums[i]-1) {
    		 return nums[i];
    	 }
     }
     return -1;
    }
static void sort(int [] a) {
	int i=0;
while(i<a.length) {
	int correctposition=a[i]-1;
	if(a[i]!=a[correctposition]) {
		swap(a,i,correctposition);
	}
	else {
		i++;
	}
}
}

 static void swap(int [] a,int i, int correctposition) {
	int temp=a[i];
	a[i]=a[correctposition];
	a[correctposition]=temp;
	
}
public static void main(String[] args) {
	int [] nums= {1,3,4,2,5};
	int ans=(findDuplicate( nums));
	System.out.println(ans);
}
}
