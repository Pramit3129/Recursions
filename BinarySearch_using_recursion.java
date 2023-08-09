import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch_using_recursion {
    static int BinarySearch(int[] n,int s,int e,int t){
        int m=s+(e-s)/2;
        //Base Case
        if(s>e){
            System.out.println("Element Not Found!! ");
            return -1;
        }
        if(n[m]==t) return m;
        else if(n[m]<t) return BinarySearch(n,m+1,e,t);
        else return BinarySearch(n,s,m-1,t);
    }

    public static void main(String[] args) {
        int[] num={1,3,5,9,10,11,14,48,220};
        Scanner sc = new Scanner(System.in);
        System.out.println(Arrays.toString(num));
        System.out.println("Enter your Target element: ");
        int t=sc.nextInt();
        int ans =BinarySearch(num,0,num.length-1,t);
        if(ans!=-1)
        System.out.println("Element found at position: "+ans);
    }
}