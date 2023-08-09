import java.util.Scanner;

public class Length_of_string_using_recursion {
    static int len(String s){
        // if we reach at the end of the string
        if (s.equals(""))
            return 0;
        else
            return len(s.substring(1)) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.next();
        System.out.println("The length of the String '"+s+"' is: "+len(s));
    }
}