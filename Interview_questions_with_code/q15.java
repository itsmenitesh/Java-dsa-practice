public class q15 {
    public static void main(String[] args) {
        int arr[]={7,4,8,9,3,1,4,5,3,3,21,4,5,3,2,14,4,56,2,1,1,1};
        int target = 100;
        //sorting
        BubbleSort(arr);
        InsertionSort(arr);
        SelectionSort(arr);
        //searching
        linearSearch(arr,target);
        binarySearch(arr,target);
        jumpSearch(arr,target);
    }
    static void BubbleSort(int arr[]){
        for(int i =0;i<arr.length;i++){
            for(int j=0;j< arr.length-1;j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i =0;i<arr.length;i++)System.out.print(arr[i]+" ");
        System.out.println();
    }

    static void InsertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j=i-1;
            while ((j>=0) && key<arr[j]){

                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for(int i =0;i<arr.length;i++)System.out.print(arr[i]+" ");
        System.out.println();
    }
    static void SelectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
                int temp=arr[smallest];
                arr[smallest]=arr[i];
                arr[i]=temp;
            }
        }
        for(int i =0;i<arr.length;i++)System.out.print(arr[i]+" ");
        System.out.println();
    }

    //searching
    static void linearSearch(int []arr,int target){
        for(int i=0;i<arr.length;i++)if(arr[i]==target){System.out.println("found");return;}
        System.out.println("Not-Found");
    }
    static void binarySearch(int []arr,int target){
        int f=0,l=arr.length-1;
        while (f<l){
            int mid = f+(l-f)/2;
            if(arr[mid]==target){
                System.out.println("found");
                return;
            }else if(arr[mid]>target) l=mid-1;
            else f=mid+1;
        }
        System.out.println("Not-Found");
    }

    static void jumpSearch(int[] arr, int target) {
        int n = arr.length;
        int step = (int) Math.floor(Math.sqrt(n));
        int prev = 0;

        while (arr[Math.min(step, n) - 1] < target) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n) {
                System.out.println("Not-Found");
                return;
            }
        }

        // Perform a linear search within the block
        while (arr[prev] < target) {
            prev++;
            if (prev == Math.min(step, n)) {
                System.out.println("Not-Found");
                return;
            }
        }

        // If the element is found
        if (arr[prev] == target) {
            System.out.println("Found");
            return;
        }

        System.out.println("Not-Found");

    }

}
