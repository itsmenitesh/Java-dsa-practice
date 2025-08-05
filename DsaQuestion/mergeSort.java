public class mergeSort {

    public static void conquer(int arr[] ,int si, int mid, int ei){
        int mergerd[] = new int[ei-si+1];
        int idx1 = si;
        int idx2 = mid+1;
        int x =0;
        //O(n)
        while(idx1 <= mid && idx2 <= ei){
            if(arr[idx1]<=arr[idx2]){
                mergerd[x++] = arr[idx1++];
            }else {
                mergerd[x++]=arr[idx2++];
            }
        }
        while(idx1 <= mid){
            mergerd[x++] = arr[idx1++];
        }
        while (idx2 <= ei){
            mergerd[x++] = arr[idx2++];
        }
        for(int i=0 , j=si; i<mergerd.length;i++,j++){
            arr[j] = mergerd[i];
        }
    }
    public static void divide(int arr[], int si, int ei){
        if(si>=ei)return;
        //O(nlogn)
        int mid = si + (ei-si)/2;
        divide(arr,si , mid);
        divide(arr,mid+1,ei);
        conquer(arr , si , mid, ei);
    }
    public static void main(String[] args) {
        int arr[] = {2,7,5,8,3,1,9,6,4,10};
        divide(arr , 0 , arr.length-1);

        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
//time complexity will be nlogn.
// in merge sort we follow divide and conquer rule like first we divide arr in half-and-half till they get separated single and then after we use
//to merge it using conquer.
