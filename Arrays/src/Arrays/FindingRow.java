package Arrays;

public class FindingRow {
static int Maxrowsum(int [][] a) {
	int currentsum=0;
	int maxsum=0;
	int index=0;
	int j=-1;
	int i=0;
	for(int [] n:a) {
		for( i=0;i<a[0].length;i++) {
			currentsum+=n[i];
			j++;
		}
		if(currentsum>maxsum) {
			index=(j-i)%a[0].length;
			maxsum=Math.max(maxsum, currentsum);
			j=0;
		}
		
		currentsum=0;
	}
	return index;
}
public static void main(String[] args) {
	int [][] a= {{0,1,1,1},{1,1,1,1},{0,1,0,1},{0,0,0,0}};
	System.out.println(Maxrowsum(a));
}
}
