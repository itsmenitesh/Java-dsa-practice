public class Subarray {
    public static void main (String args[]){

        int arr[] = {1,3,5,7,11,13,17 , 19 , 23 , 29 , 31};
        int target = 41;
        int k = 3;


        int i=0;
        int j = k-1;
        int sum = 0;

        for(int m=0 ; m<k ; m++){
            sum+= arr[m];
        }

        if(sum==target){
            System.out.print(i +" " +j);
            return;
        }


        while(j<arr.length){

            sum-= arr[i];
            i++;
            j++;
            sum += arr[j];

            if(sum==target){
                System.out.print(i +" " +j);
                return;
            }
        }


        System.out.print("Sum of subarray of  "+target + " of size "+k+ " doesn't exist in given array ");

    }
}

