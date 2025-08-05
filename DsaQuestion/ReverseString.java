public class ReverseString {
    public static void main(String[] args) {
        String s = "Nitesh";


        char arr []=s.toCharArray();
        int f=0,l=arr.length-1;
        while(f<l){
            char temp=arr[f];
            arr[f]=arr[l];
            arr[l]=temp;
            f++;
            l--;
        }
        s= new String(arr);

        System.out.print(s);

        //        String rev = "";
//        for(int i=s.length()-1;i>=0;i--){
//            rev+=s.charAt(i);
//        }
    }
}
