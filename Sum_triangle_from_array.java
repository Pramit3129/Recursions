//qs: https://www.geeksforgeeks.org/sum-triangle-from-array/
import java.util.Arrays;
public class Sum_triangle_from_array {
    static int[] sum(int[] n , int size){
        if(size==1){
            return new int[]{n[0]+n[1]};
        }
        int[] ans = new int[size];
        for(int i=0;i<ans.length;i++){
            //ans[n]=n[n]+n[n+1]
            ans[i]=n[i]+n[i+1];
        }
        System.out.println(Arrays.toString(ans));
        return sum(ans,ans.length-1);
    }

    public static void main(String[] args) {
        int[] num ={1, 2, 3, 4, 5};
        int[] ans =sum(num,num.length-1);
        System.out.println(Arrays.toString(ans));
    }
}