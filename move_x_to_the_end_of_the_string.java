import java.util.Scanner;
public class move_x_to_the_end_of_the_string {
    public static StringBuilder st= new StringBuilder();
    public static int n = 0;
    public static void movex(Character a ,String s, int ind){
        if(ind==s.length()){
            for(int i =0;i<n;i++){
                st.append(a);
            }
            System.out.println(st);
            return;}

        if(s.charAt(ind)!=a){st.append(s.charAt(ind));}
        else{n+=1;}
        movex(a,s,ind+1);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter String: ");
        String s = sc.next();
        System.out.println("Enter Character: ");
        Character a= sc.next().charAt(0);
        movex(a,s,0);
    }
}
