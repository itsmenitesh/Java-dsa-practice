public class q14 {
    public static void main(String[] args) {

        int n =32376;
        int valCount=n;
        int count=0;
        while (valCount!=0){
            count++;
            valCount/=10;

        }
        int arr[]=new int[count];

        int val=n;
        int k=0;
        while (val!=0){
            int rem = val % 10;
                arr[k++]=rem;
            val/=10;
        }
        for(int i =0;i<arr.length;i++){
            for(int j=0;j< arr.length-1;j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        int sortVal=0;
        for(int i=0;i< arr.length;i++)sortVal=sortVal*10+arr[i];
        System.out.print(sortVal);
    }
}
