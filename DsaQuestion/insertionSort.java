public class insertionSort {
    public static void main(String[] args) {
        int arr[] = {2,7,5,8,3,1,9,6,4,10};
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int j=i-1;
            while(j>=0 && current <arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}

// time complexity will be O(n^2) in the worst scenario.
// basically, we divide arr into two part sorted and unsorted for the first time we put the first value of an array in sorted part especially we assume the first value is sorted, then we compare that value with unsorted value
// if the sorted value is greater than unsorted value, so we swap the value.