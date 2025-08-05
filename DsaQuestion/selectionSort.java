public class selectionSort {
    public static void main(String[] args) {
        int arr[] = {2,7,5,8,3,1,9,6,4,10};
        for(int i=0;i<arr.length-1;i++){
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest] > arr[j]){
                    smallest=j;
                }
            }
            int tmp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=tmp;

        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
// time complexity will be O(n^2) in the worst scenario.
//basically in selection sort it selects i value as smallest and checks in left arr that is there is any other value present in an array which is smaller than the
//smallest value if yes, then we change smallest with this smallest index and so on.