import java.util.Scanner;
public class remove_occurance {
    public static String rem_occ(String a ,Character b, int ind){
        if(ind==a.length()){
            return "";
        }
        String s = rem_occ(a,b,ind+1);
        if(Character.toLowerCase(a.charAt(ind))!=Character.toLowerCase(b)){
            return a.charAt(ind)+s;
        }
        else{
            return s;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Word/Line: ");
        String s= sc.nextLine();
        System.out.println("Enter the character you want to remove: ");
        String b= sc.next();
        System.out.println(rem_occ(s,b.charAt(0),0));
    }
}
