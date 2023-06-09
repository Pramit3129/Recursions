import java.util.Scanner;
public class value_of_p_raised_to_the_power_q_using_recursion {
    public static int power(int p , int q){
        if(q==1){
            return p;}
        int k = power(p,q-1);
         k*=p;
         return k;}
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int p= sc .nextInt();
    int q = sc .nextInt();
    System.out.println(p+" raised to the power "+q+" is: "+power(p,q));
}}
