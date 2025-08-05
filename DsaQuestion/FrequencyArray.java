import java.util.*;
public class FrequencyArray {
    public static void main(String[] args) {
        char arr[]={'c','a','a','r','f','v','a'};
        int freq []=new int[256];
//        HashMap<Character,Integer> hm = new HashMap<>();
//        for(int i=0;i<arr.length;i++){
//            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
//        }
//        for(char key : hm.keySet()){
//            int val=hm.get(key);
//            System.out.println(key+" "+val);
//        }

        for(int i=0;i<arr.length;i++){
            freq[arr[i]-'0']++;
        }
        for(int i=0;i< freq.length;i++)if(freq[i]>0)System.out.println((char) i+" = "+freq[i]);
    }
}
