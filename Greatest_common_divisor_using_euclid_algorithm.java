import java.util.Scanner;
//Euclid's Algorithm:   GCD= Greatest common divisor
// 1) GCD(x,y) = GCD(y, x%y)
// 2) GCD(x , 0) = x
public class Greatest_common_divisor_using_euclid_algorithm {
    public static int GCD(int x , int y) {
        if(y==0){
            return x;
        }
        int ans = GCD(y, x % y);
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("GCD of "+n+" and "+m+" is: "+GCD(n,m));

    }
}
