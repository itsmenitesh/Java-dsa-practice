import java.util.Arrays;

public class secondMax {
    public static void main(String [] args) {
        int arr[] = {5, 7, 8, 9, 4, 5, 9, 6, 1, 2, 6, 4, 5, 6, 8, 9,9,9,9,9,8,8,8,8};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 1; i--) {
            if (arr[i] != arr[i - 1]) {
                System.out.print(arr[i-1]);
                return;
            }
        }
    }

    //        for(int i=0;i<arr.length;i++){
//            if(arr[i]>max){
//                secondMax = max;
//                max=arr[i];
//            }else if(arr[i]<max && arr[i]>secondMax)secondMax=arr[i];
//        }
//        System.out.print(secondMax);


    }
