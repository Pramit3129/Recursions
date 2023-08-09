import java.util.Scanner;
public class First_uppercase_letter {
    static void FirstUpper(String s,int len){
        //base case
        if(len==s.length()-1) {
            if (Character.isUpperCase(s.charAt(s.length() - 1))) {
                System.out.println(s.charAt(s.length() - 1));
                return;
            } else {
                System.out.println("Not Found");
                return;
            }
        }
        //self work
        if(Character.isUpperCase(s.charAt(len))) {
            System.out.println(s.charAt(len));
            return;
        }
        else{
            FirstUpper(s,len+1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter String: ");
        Scanner sc = new Scanner(System.in);
        String s =sc.next();
        System.out.print("First Uppercase Character in "+s+" is:  ");
        FirstUpper(s,0);
    }
}