package Arrays;
//https://leetcode.com/problems/majority-element/
import java.util.*;
public class Majaority_Element {
 static int majorityElement(int[] a) {
     HashMap<Integer,Integer> map=new  HashMap<Integer,Integer>();
     for(int i=0;i<a.length;i++){
    	 //if(map.containsKey(a[i])) {}
    	 map.put(a[i], map.getOrDefault(a[i], 0)+1);}
    		for(int i=0;i<a.length;i++) {
    			if(map.containsKey(a[i])&& map.get(a[i])>a.length/2) {
    				return a[i];
    			}
    		} 
    	 
    	return -1;
    }
 public static void main(String[] args) {
	int [] a= {2,2,1,1,1,2,2};
	System.out.println(majorityElement( a) );
}
}
