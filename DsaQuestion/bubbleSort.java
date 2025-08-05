public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = {2,7,5,8,3,1,9,6,4,10};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;

                }
            }
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
// time complexity will be O(n^2) in the worst scenario.
//basically bubble sort swap value one by one (means its check j and j+1 value and swap that than again do a same process)
// like in one iterate it sort one value.