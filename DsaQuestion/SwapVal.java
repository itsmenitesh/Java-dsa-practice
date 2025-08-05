public class SwapVal {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        System.out.println("old value : a="+a+" "+"b="+b);
//using temp
//        int temp=a;
//        a=b;
//        b=temp;


//without using third variable
        a= a+b;
        b= a-b;
        a= a-b;


        System.out.println("new value : a="+a+" "+"b="+b);


        // swap string
        String first = "Nitesh";
        String second = "Choudhary";
        System.out.println(first+" "+second);
        first=first+second;
        second=first.substring(0,first.length()-second.length());
        first=first.substring(second.length());
        System.out.println(first+" "+second);
    }
}
