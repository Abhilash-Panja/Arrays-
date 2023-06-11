package Arrays;

import java.util.*;

//https://leetcode.com/problems/longest-consecutive-sequence/
public class Longest_Consecutive_Sequence {
static int longestConsecutive(int[] a) {
	int c=0;
	int length=0;
	//using hashset to avoid duplicate values
     HashSet<Integer> l=new   HashSet<Integer> ();
     if(a.length==0) {
    	 return 0;
     }
     for(int i=0;i<a.length;i++) {
    	 l.add(a[i]);
     }
     for(int i=0;i<a.length;i++) {
    	 if(!l.contains(a[i]-1) ) {
  // starting index find chasamu anta akkada nundi mana elements start avvuthay
    		 int val=a[i]+1;
    		 while(l.contains(val)) 
    			
    			 val++;
    		 
    		 length=Math.max(length, val-a[i]);
    	 
    	 }
    	 
    		 
    	 }
     return length;
    }
public static void main(String[] args) {
	int [] a= {100,4,200,1,3,2};
	System.out.println(longestConsecutive( a));
}
}
