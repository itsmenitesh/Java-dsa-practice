import java.util.HashMap;

public class q31 {
    public static void main(String[] args) {
        int arr[]={7,4,8,9,3,1,4,5,3,3,21,4,5,3,2,14,4,56,2,1,1,1};

        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int i =0 ;i< arr.length;i++){

            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);

        }

        int max=Integer.MIN_VALUE;
        for(Integer c : hm.keySet()){
            int val = hm.get(c);
            if(val>max){
                max=val;

            }
        }
        System.out.println(max);
    }
}
