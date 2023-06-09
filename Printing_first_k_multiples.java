import java.util.Scanner;
//question: Given a number n and a value k. Print first k multiples of the number n
public class Printing_first_k_multiples {
    public static void Printmultiples(int n, int k){
        if(k==1){
            System.out.print(n+" ");
            return;
        }
        Printmultiples(n,k-1);
        System.out.print(n*k+" ");
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt(); //number
        int k = sc.nextInt();  // k ( no. of multiples to be printed)
        System.out.print("First "+k+" multiples of "+n+" are: ");
        Printmultiples(n,k);
    }
}
