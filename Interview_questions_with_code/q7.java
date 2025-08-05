public class q7 {
    public static void main(String[] args) {

        int arr[]={7,4,8,9,3,1,4,5,3,3,21,4,5,3,2,14,4,56,2,1,1,1};
        int count=0,min=Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
                if(count<3 && min > arr[i]){
                    min=arr[i];
                    count++;
                }
        }
        System.out.print(min);
    }
}
