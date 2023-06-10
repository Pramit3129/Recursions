import java.util.Scanner;

public class Armstrong_no {
    public static int Armstrong(int a ){
        if(a>=0 && a<=9){
            return a*a*a;
        }
        int k= Armstrong(a/10);
        k+=(a%10)*(a%10)*(a%10);
        return k;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int no = sc .nextInt();
        if(no==Armstrong(no)) {
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not an Armstrong Number");
        }
    }
}
