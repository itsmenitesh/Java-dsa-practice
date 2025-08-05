public class q3 {
    public static void main(String[] args) {
        String str = "Nitesh";
        String rev="";

        // first method
//        for(int i=str.length()-1;i>=0;i--)rev+=str.charAt(i);

        // second method
        char arr[]=str.toCharArray();
        int f=0,l=arr.length-1;
        while(f<l){
            char temp = arr[f];
            arr[f]=arr[l];
            arr[l]=temp;
            f++;
            l--;
        }
        for(int i=0;i<arr.length;i++)rev+=arr[i];
        System.out.println(rev);

    }
}
