import java.util.Scanner;
public class sum_of_digits_using_recursion {
    public static int sumDigit(int n){
        if(n>=0 && n<=9){return n;}
        int sum=sumDigit(n/10);
        sum+=n%10;
        return sum;}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum of the digits of the given number is : "+sumDigit(n));
    }
}
