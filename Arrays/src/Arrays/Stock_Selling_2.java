package Arrays;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
public class Stock_Selling_2 {
static int maxProfit(int[]a) {
	int profit=0;
	int maxprofit=0;
        if(ascending(a)) {
        	profit=a[a.length-1]-a[0];
        	return profit;
        }
        if(descending(a)) {
        	return 0;
        }
        else {
        	int min=a[0];
        	//int i=0;
        	for(int i=1;i<a.length;i++) {
        		if(min>a[i]) {
        			min=a[i];
        		}
        		else {
        			if(a[i]-min>profit) {
        				maxprofit+=a[i]-min;
        				min=a[i];
        			}
        			
        		}
        	}
        	
        }
        return maxprofit;
        
    }

        
    

 static boolean descending(int[] a) {
	for(int i=0;i<a.length;i++) {
		if(i+1<a.length && a[i]<a[i+1]) {
			return false;
		}
	}
	return true;
}

static boolean ascending(int[] a) {
	for(int i=0;i<a.length;i++) {
		if(i+1<a.length && a[i]>a[i+1]) {
			return false;
		}
	}
	return true;
}
public static void main(String[] args) {
	int [] a= {3,3,5,0,0,3,1,4};
	System.out.println(maxProfit(a));
}
}
