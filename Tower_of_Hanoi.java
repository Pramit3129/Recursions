public class Tower_of_Hanoi {
    public static void TOH(int n, String s, String h, String d){
        if(n==1){
            System.out.println(n+" goes to "+d);
            return;
        }
        TOH(n-1,s,d,h);
        System.out.println(n+" goes to "+d);
        TOH(n-1,h,s,d);
    }
    public static void main(String[] args){
        int n = 3;
        TOH(n,"Source","Helper","Destination");


    }
}
