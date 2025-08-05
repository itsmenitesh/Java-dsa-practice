public class q5 {

    public static void main(String[] args) {

        int arr[]={7,4,8,9,3,1,4,5,3,3,21,4,5,3,2,14,4,56,2,1,1,1};
        for(int i =0;i<arr.length;i++){
            int val=arr[i];
            if (isPrime(val)) {
                System.out.print(arr[i]+" ");
            }
        }
    }
   static boolean isPrime(int val){
        if(val<=1)return false;
        for(int i=2;i<=val/2;i++){
            if(val % i ==0)return false;
        }
        return  true;
    }
}
