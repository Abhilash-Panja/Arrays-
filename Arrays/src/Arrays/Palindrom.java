package Arrays;
import java.util.*;
public class Palindrom {
 static boolean isPalindrome(int x) {
	 if(x<0) {
		 return false;
	 }
   String s=Integer.toString(x) ;
   int start=0;
   int end=s.length()-1;
   ArrayList<Integer> l=new ArrayList<>();
//   while(start<end) {
//	   if(s.charAt(start)==s.charAt(end)) {
//		   start++;
//		   end--;
//		    }
//	   else {
//		   return false;
//	   }
//
//	   
//   }
   for(int i=s.length()-1;i>=0;i--) {
	  l.add(i) ;
   }
   System.out.println(l);
   return true;
	 

   }
 public static void main(String[] args) {
	 int x=123;
	System.out.println(isPalindrome(x));
}
}
