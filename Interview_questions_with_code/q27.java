public class q27 {
    public static void main(String[] args) {
        int n =123321;
        int rev=0;
        int val=n;
        while (val!=0){
            int rem = val % 10;
            rev=rev*10+rem;
            val/=10;
        }
        if(n==rev)System.out.print("Palindrome");
        else System.out.print("non-palindrome");
    }
}
