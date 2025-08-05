import java.util.HashMap;

public class q25 {
    public static void main(String[] args) {
        String str = "Nitesh";
        HashMap<Character , Integer> hm = new HashMap<>();
        for(int i =0 ;i<str.length();i++){
            char ch = str.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);

        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (hm.get(ch) == 1) {
                System.out.println("Non-repeating character: " + ch);
                return;
            }
        }
    }
}
