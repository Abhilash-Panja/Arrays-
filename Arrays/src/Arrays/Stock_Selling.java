package Arrays;

public class Stock_Selling {
static int maxProfit(int[] a) {
  int profit=0;
  int min=a[0];
  for(int i=1;i<a.length;i++) {
	  if(min>a[i]) {
		  min=a[i];
	  }
	  else {
		  if(a[i]-min>profit) {
			  profit=a[i]-min;
		  }
	  }
  }
  if(profit>0) {
  return profit;}
  else {
	  return 0;
  }
  }
 public static void main(String[] args) {
	int [] a= {7,1,5,3,6,4};
	System.out.println(maxProfit(a));
}
}
