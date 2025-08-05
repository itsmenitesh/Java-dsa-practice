public class q17 {
    public static void main(String[] args) {
        int n =5;
        fibUsingVar(n);
        fibUsingArr(n);
       System.out.println(fibUSingRecursion(n));

       factUsingIteration(n);
       System.out.println(factUsingRecursion(n));
    }
    static void fibUsingVar(int n ){
        int a=0,b=1;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<=n;i++){
            int next = a+b;
            System.out.print(next+" ");
            a=b;
            b=next;
        }
        System.out.println();

    }
    static void fibUsingArr(int n){
        int [] arr =new int[n+2];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(arr[n]);
    }
    static int fibUSingRecursion(int n){
        if(n==0)return 0;
        if(n==1 || n==2)return 1;
        return fibUSingRecursion(n-1)+fibUSingRecursion(n-2);
    }

    static void factUsingIteration(int n ){
        int val=1;
        for(int i=1;i<=n;i++){
            val*=i;
        }
        System.out.println(val);
    }

    static int factUsingRecursion(int n){
        if(n==1)return 1;
        return n * factUsingRecursion(n-1);
    }
}
