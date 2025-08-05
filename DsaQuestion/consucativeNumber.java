import java.util.HashSet;
import java.util.Stack;

public class consucativeNumber {
    public static void main(String[] args) {
        int arr [] = {1, 94, 93, 1000, 5, 92, 78};
      HashSet<Integer> st = new HashSet<>();
        for(int i=0;i<arr.length;i++)st.add(arr[i]);

        int longest=0;
        for(int val : arr){
            int count =1;
            while(st.contains(val+1)){
                val++;
                count++;
            }
            longest = Math.max(longest , count);
        }
        System.out.print(longest);
    }
}
