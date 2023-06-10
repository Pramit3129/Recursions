import java.util.Scanner;
public class Max_value_of_the_array {
    public static int maxVal(int[] n, int ind){
        if(ind==n.length-1){
            return n[ind];
        }
        int k = maxVal(n,ind+1);
        if(k<n[ind]){
            k=n[ind];
        }
        return k;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] num = new int[size];
        for(int i =0; i<num.length;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("Max value element in the array is: "+maxVal(num,0));
    }
}
