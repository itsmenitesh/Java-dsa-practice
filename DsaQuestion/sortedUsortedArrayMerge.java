public class sortedUsortedArrayMerge {
    public static void main(String[] args) {
        int sorted[]={1,2,3,4,5,6};
        int unsorted []={5,7,9,4,2,3,4,10};
        int merge[]=new int[sorted.length+unsorted.length];

//        for(int i=0;i<sorted.length;i++){
//            for(int j=i;j<unsorted.length-1;j++){
//                if(unsorted[j]>unsorted[j+1]){
//                    int temp = unsorted[j+1];
//                    unsorted[j+1]=unsorted[j];
//                    unsorted[j]=temp;
//                }
//            }
//        }
        for (int i = 0; i < unsorted.length - 1; i++) {
            for (int j = 0; j < unsorted.length - i - 1; j++) {
                if (unsorted[j] > unsorted[j + 1]) {
                    int temp = unsorted[j];
                    unsorted[j] = unsorted[j + 1];
                    unsorted[j + 1] = temp;
                }
            }
        }

        int k=0,l=0,m=0;
        while (k<sorted.length && l<unsorted.length){
            if(sorted[k]>=unsorted[l]){
                merge[m]=unsorted[l];
                m++;
                l++;
            }else {
                merge[m]=sorted[k];
                m++;
                k++;
            }
        }
        while(k<sorted.length){
            merge[m]=sorted[k];
            m++;
            k++;
        }

        while(l<unsorted.length){
            merge[m]=unsorted[l];
            m++;
            l++;
        }

        for(int i=0;i<merge.length;i++){
            System.out.print(merge[i]+" ");
        }
    }

}
