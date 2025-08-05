public class q30 {
    public static void main(String[] args) {
        int n=5;
        fibUsingArr(n);
        System.out.println(fibUSingRecursion(n));

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
}
