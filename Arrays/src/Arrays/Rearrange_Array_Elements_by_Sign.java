package Arrays;

import java.util.Arrays;

//https://leetcode.com/problems/rearrange-array-elements-by-sign/
public class Rearrange_Array_Elements_by_Sign {
static int[] rearrangeArray(int[] a) {
/* Manaku oka even size array echaru and dhantlo +ve and -ve elements unay
 mana task ela arrange chyadam one +ve and one -ve ela arrange chyalii
 example array=[3,1,-2,-5,2,-4]
 and manku oka condition echaru frist element +ve undali ani
 so manam +ve elements place chasinappudu avi akkada place avvuthaii anta 
 frist +ve 0 dhagara
 second +ve 2 dhagra
 and next 4 dhagara
 bcz of that na frist positive integer=0 dhagara lie avvuthundhi
 second two places forward lo;
 same for -ve elments also.
 */	
        int [] ans=new int[a.length];
        int positiveindex=0;
        int negativeindex=1;
        for(int i=0;i<a.length;i++) {
        	if(a[i]<0) {
        		ans[negativeindex]=a[i];
        		negativeindex+=2;
        	}
        	else {
        		ans[positiveindex]=a[i];
        		positiveindex+=2;
        	}
        }
        return ans;
        
    }
public static void main(String[] args) {
	int [] a= {3,1,-2,-5,2,-4};
	System.out.println(Arrays.toString(rearrangeArray( a) ));
}
}
