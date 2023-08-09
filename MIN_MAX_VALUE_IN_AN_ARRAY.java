import java.util.Arrays;

public class MIN_MAX_VALUE_IN_AN_ARRAY {
    static int MaxMin(int[] n, int s, int currMaxMin, boolean Max) {
        //base case:
        if (s == 0) {
            if(Max)
                return Math.max(currMaxMin,n[0]);
            else
                return Math.min(currMaxMin,n[0]);
        }
        if (Max) {
            currMaxMin = MaxMin(n, s-1, currMaxMin, true);
            return Math.max(currMaxMin, n[s]);
        } else {
            int ans = MaxMin(n, s-1, currMaxMin, false);
            return Math.min(ans, n[s]);
        }
    }

    public static void main(String[] args) {
        int[] ans ={-1,-1};
        int[] num={42, 4, 45, 6, 10, -8};
        ans[0]=MaxMin(num,num.length-1,Integer.MIN_VALUE,true);  //Max Value
        ans[1]=MaxMin(num,num.length-1,Integer.MAX_VALUE,false); //Min Value
        System.out.println("Max Value in the Array: "+ans[0]);
        System.out.println("Min Value in the Array: "+ans[1]);
    }
}