public class q13 {
    public static void main(String[] args) {
        String str1 = "Nitesh";
        String str2 ="Nitesh";
        for(int i =0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                System.out.print("Not Equal");
                return;
            }
        }
        System.out.print("Equal");
    }
}
