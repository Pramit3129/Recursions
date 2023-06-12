import java.util.Scanner;
public class remove_all_duplicate_values {
    public static boolean[] aplha = new boolean[26];
    public static String st = "";
    public static void removeDuplicate(String s , int ind){
        if(ind<0){
            return;
        }
        removeDuplicate(s,ind-1);
        if(!aplha[(s.charAt(ind) - 'a')]){
            st+=s.charAt(ind);
            aplha[(s.charAt(ind)-'a')]=true;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        removeDuplicate(s,s.length()-1);
        System.out.println(st);
    }
}
