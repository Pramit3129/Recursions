import java.util.Scanner;
public class first_and_last_occ {
    public static int first= -1;
    public static int last = -1;
    public static void flocc(Character a,String s, int n){
        if(n==s.length()){
            System.out.println("First Occurance at pos: "+ first);
            System.out.println("Last Occurance at pos: "+last);
            return;
        }
        if(s.charAt(n)==a)
        {
            if(first==-1){
                first=n;}
            else{
                last = n;
            }
        }
        flocc(a,s,n+1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = sc.next();
        System.out.println("element: ");
        String a = sc.next();
        Character o =a.charAt(0);
        flocc(o,s,0);
    }
}
