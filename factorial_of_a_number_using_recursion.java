import java.util.Scanner;

public class factorial_of_a_number_using_recursion {
    public static int factorial(int a){
        if(a==0){
            return 1;}
        int k = factorial(a-1);
        k*=a;
        return k;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which we want Factorial: ");
        int n =sc.nextInt();
    System.out.println("The Factorial of "+n+" is "+factorial(n));
}}
