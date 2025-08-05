import java.util.HashMap;

public class q28 {
    public static void main(String[] args) {
        String str = "cbcbnbmsdfhkasd";
        HashMap<Character , Integer> hm = new HashMap<>();
        for(int i =0 ;i<str.length();i++){
            char ch = str.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);

        }
        char highest='a';
        int max=Integer.MIN_VALUE;
        for(char c : hm.keySet()){
            int val = hm.get(c);
            if(val>max){
                max=val;
                highest =c;
            }
        }
        System.out.println(highest);
    }
}
