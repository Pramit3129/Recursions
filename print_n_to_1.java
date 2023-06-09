public class print_n_to_1 {
    public static void Pn1(int n){
        if(n<1){return;}
        System.out.print(n+" ");
        Pn1(n-1);}

    public static void main(String[] args){
        Pn1(5);
    }
}
