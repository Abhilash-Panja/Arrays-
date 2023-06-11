package Arrays;

import java.util.Arrays;
import java.util.*;

public class Finding_All_unique_numbers {
static int uniqueNumber(int [] a) {
int unique=0;
for(int i=0;i<a.length;i++) {
	unique^=a[i];
}

return unique ;
}
public static void main(String[] args) {
int [] a= {1,4,2,5,5,2,4};	
System.out.println(uniqueNumber( a));
}
}
