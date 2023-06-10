import java.util.Scanner;
public class occurance_of_letter_in_a_string {
    public static int occur(String s , String a,int ind){
        if(ind<0){
            return 0;
        }
        int ans =occur(s,a,ind-1);
        if(String.valueOf(s.charAt(ind)).compareTo(a)==0){
            ans+=1;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String a= sc.next();
        System.out.println("Occurance of the letter "+ a +" in the word "+s+" is: "+occur(s,a,s.length()-1));
    }
}
