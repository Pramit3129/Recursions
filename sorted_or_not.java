public class sorted_or_not {
    public static Boolean SortedArray(int[] s , int ind){
        if(ind==s.length-1){
            return true;
        }
        if(s[ind]>=s[ind+1]){
            return false;
        }
        else{
        return SortedArray(s,ind+1);
    }}
    public static void main(String[] args){
        int[] num = {1,5,6,8,55};
        if(SortedArray(num,0)){
            System.out.println("Array is Sorted");
        }
        else{
            System.out.println("Array is Not sorted");
        }
    }
}
