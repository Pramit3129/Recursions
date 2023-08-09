import java.util.Scanner;
public class nth_term_of_series {
    //the series: 1, 3, 6, 10, 15, 21...
        static int Term(int n , int i){
            //base case
            if(n==1){
                return 1;
            }
            //self work
            int ans = Term(n-1,i-1)+i;
            return ans;
        }
       public static int findNthTerm(int N) {
            // code here
            return Term(N,N);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which term to find: ");
        int n= sc.nextInt();
        System.out.println(n+"th term of the series is: "+findNthTerm(n));
    }
    }