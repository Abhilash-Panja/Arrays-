package Arrays;
//http://surl.li/hxtsy
public class Maximum_Length_Of_Array_of_K_Sum {
static int max_Length(int [] a,int k) {
	int i = 0;
    int j = 0;
    int sum = 0;
    int length = 0;
    while (j < a.length && i < a.length) {
        sum += a[j];
        if (sum == k) {
            length = Math.max(length, (j - i) + 1);
            j++;
        } else if (sum < k) {
            j++;
        } else if (sum > k) {
            while (sum > k) {
                sum -= a[i];
                i++;
            }
            j++;
        }
    }
    return length;
}

public static void main(String[] args) {
    int[] a = {15,-2,2,-8,1,7,10,23};
    int k = 0;
    System.out.println(max_Length(a, k));
}
}