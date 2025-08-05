package Recursion;

public class Recursion {

    static void printNumber(int val){
        if(val<1)return;
        System.out.println(val);
        printNumber(val-1);


    }

    static int  Factorial(int val){
        if(val==0 || val==1)return 1;
      return val*Factorial(val-1);

    }




    public static void main(String[] args) {
        printNumber(5);
        System.out.println(Factorial(5));

    }

}

