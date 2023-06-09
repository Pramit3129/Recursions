import java.util.Scanner;
//i.e. the series is 1-2+3-4+5-6+7-8.....n
public class sum_of_natural_number_till_n_with_alternate_signs {
    public static int sumalt(int n){
        if(n==1){return 1;}
        int k =sumalt(n-1);
        if(n%2==0){k-=n;}
        else{k+=n;}
        return k;}
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum of the series till "+n+" is: "+sumalt(n));
    }
}
