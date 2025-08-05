public class sorting {
    public static void main(String[] args) {
        int arr[]={7,4,8,9,3,1,4,5,3,3,21,4,5,3,2,14,4,56,2,1,1,1};

        //sorting
//        BubbleSort(arr);
//        InsertionSort(arr);
//        SelectionSort(arr);

        divide(arr , 0 ,arr.length-1);
        for(int i =0;i<arr.length;i++)System.out.print(arr[i]+" ");
        System.out.println();

    }

    // merge sort
    static void divide(int arr[],int si,int ei){
        if(si>=ei)return;
        int mid = si+(ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);

        conquor(arr,si,mid,ei);
    }
    static void conquor(int arr[],int si,int mid,int ei){
        int merged[]=new int[ei-si+1];
        int index1=si;
        int index2=mid+1;
        int x=0;
        while (index1<=mid && index2<=ei){
            if(arr[index1]>=arr[index2]){
                merged[x++]=arr[index2++];

            }else {
                merged[x++]=arr[index1++];
            }
        }
        while(index1<=mid){
            merged[x++]=arr[index1++];
        }
        while(index2<=ei){
            merged[x++]=arr[index2++];
        }

        for(int i=0,j=si;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }
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
    static void SelectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }
}
