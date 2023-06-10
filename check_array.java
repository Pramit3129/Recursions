import java.util.Scanner;
public class check_array {
    public static void checkarray(int [] a ,int n, int ind){
        if(ind==a.length){
            System.out.println("Element not Present in array");
            return;
        }
        if(a[ind]==n){
            System.out.println("Element Present in array");
        }
        else{checkarray(a,n,ind+1);}
    }
    public static void main(String[] args){
        int[] num = {1,2,5,9,4};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to find: ");
        int n = sc.nextInt();
        checkarray(num,n,0);
    }
}
