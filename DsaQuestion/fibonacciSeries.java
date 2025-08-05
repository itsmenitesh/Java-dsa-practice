public class fibonacciSeries {
    public static void main(String[] args) {
        int n =20;

        //first method
//        int fib[]=new int[n+2];
//        fib[0]=0;
//        fib[1]=1;
//        for(int i=3;i<=n;i++){
//            fib[i]=fib[i-1]+fib[i-2];
//        }
//        System.out.print(fib[n]);

        //second method
//        int first = 0;
//        int second = 1;
//
//        System.out.print(first + " " + second);
//
//        for (int i = 2; i < n; i++) {
//            int next = first + second;
//            System.out.print(" " + next);
//            first = second;
//            second = next;
//        }

        //third method
        int fib = fibonacci(n);
        System.out.println("The Fibonacci number at position " + n + " is: " + fib);
    }
    private static int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1 || n == 2)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
