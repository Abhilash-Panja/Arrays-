package Arrays;
import java.util.*;
public class Majority_Element_II {
static List<Integer> majorityElement(int[] a) {
    ArrayList<Integer>l=new ArrayList<>();
    HashMap<Integer,Integer> map=new HashMap<>();
    int n=a.length;
    for(int i=0;i<a.length;i++) {
    	if(map.containsKey(a[i])) {
    		
    	}
    	map.put(a[i], map.getOrDefault(a[i], 0)+1);
    	if(map.get(a[i]) > n/3 &&  ! l.contains(a[i])) {
			l.add(a[i]);
		}
    }
    return l;
}
public static void main(String[] args) {
	int [] a= {2,2};
	System.out.println(majorityElement(a));
}
}
