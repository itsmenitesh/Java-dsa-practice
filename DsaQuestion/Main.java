import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean check[] = new boolean[256];
        int idx =0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if('A' <= ch && ch>= 'Z'){
                idx= ch - 'A';
            } else if ('a'<= ch && ch>= 'z') {
                idx = ch - 'a';

            }else {
                continue;
            }
            check[idx] = true;
        }
        for (int i = 'a'; i <= 'z'; i++) {
            if (!check[i]) {
                System.out.print("0");
                return;
            }
        }

        System.out.print("1");

    }
}