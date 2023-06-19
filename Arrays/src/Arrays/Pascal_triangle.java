package Arrays;
//https://leetcode.com/problems/pascals-triangle/
import java.util.*;
public class Pascal_triangle {
static List<List<Integer>> generate(int numRows) {
	List<List<Integer>> l=new ArrayList<>();
	ArrayList<Integer> result=new ArrayList<>();
	result.add(1);
	l.add(result);
	ArrayList<Integer> previous=new ArrayList<>();
	previous=result;
     for(int i=1;i<numRows;i++) {
    	 ArrayList<Integer> current=new ArrayList<>();
    	 current.add(1);
    	 for(int j=1;j<i;j++) {
    		 current.add(previous.get(j)+previous.get(j-1));
    	 }
    	 current.add(1);
    	 previous=current;
    	 l.add(current);
     }
     return l;
    }
public static void main(String[] args) {
	System.out.println(generate(5));
}
}
