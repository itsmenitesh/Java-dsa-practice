public class q11 {
    public static void main(String[] args) {
        int n = 10;
        int val = factorial(n);
        System.out.print(val);
    }
    static int factorial(int n){
        if(n==1)return 1;
        return n * factorial(n-1);
    }
}
