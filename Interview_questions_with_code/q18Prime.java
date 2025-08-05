public class q18Prime {
    public static void main(String[] args) {
        int n = 17;
        primeUsingIterate(n);
        if(primeUsingRecursion(n ,2)){
            System.out.println("prime");
        }else{
            System.out.println("not-prime");
        }
    }
    static void primeUsingIterate(int n){
        if(n ==1 || n==2 || n==3){
            System.out.println("prime");
            return;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                System.out.println("not-prime");
                return;
            }
        }
        System.out.println("prime");
    }
    static boolean primeUsingRecursion(int n , int divisor){
       if(n<=2)return n==2;
       if(n % divisor==0)return false;
       if(divisor * divisor > n)return true;
       return primeUsingRecursion(n,divisor+1);
    }
}
