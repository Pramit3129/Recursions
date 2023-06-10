import java.util.Scanner;
public class palindromechk {
    public static String palindrome(String a,int ind){
        if(ind==0){
            return String.valueOf(a.charAt(ind));
        }
        String s = String.valueOf(a.charAt(ind));
        s+= palindrome(a,ind-1);
        return s;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
       if(a.compareTo(palindrome(a,a.length()-1))==0){
           System.out.println("Palindrome");
        }
       else {
           System.out.println("Not Palindrome");
       }
    }
}
