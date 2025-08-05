
public class q2 {
    public static void main(String[] args) {

      String str ="Nitesh Choudhary";
        for(int i =0;i<str.length();i++){
            char c = str.charAt(i);
            char ch = Character.toLowerCase(c);
            if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' ||ch=='u')System.out.println("vowels "+ch);
            else System.out.println("consonant "+ch);

        }
    }
}
