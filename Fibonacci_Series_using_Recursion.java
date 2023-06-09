import java.util.Scanner;
public class Fibonacci_Series_using_Recursion {
    public static int Fibo(int a){
        if (a == 0 || a == 1) {return a;}
        int prev = Fibo(a-1);
        int PrevPrev=Fibo(a-2);
        return (prev+PrevPrev);}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // taking input from user to print series upto which term
        System.out.print("The Series upto "+n+" term is: ");
        for(int i =0 ; i<=n ; i++){
            System.out.print(Fibo(i)+" ");
        }
    }
}
