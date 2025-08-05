import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first string (s): ");
        String s = scan.nextLine();
        System.out.print("Enter the second string (p): ");
        String p = scan.nextLine();
        scan.close();

        List<Integer> result = new ArrayList<>();
        int[] pCount = new int[26];
        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
        }

        for (int i = 0; i <= s.length() - p.length(); i++) {
            int[] sCount = new int[26];
            for (int j = 0; j < p.length(); j++) {
                sCount[s.charAt(i + j) - 'a']++;
            }

            boolean flag = true;
            for (int j = 0; j < 26; j++) {
                if (pCount[j] != sCount[j]) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                result.add(i);
            }
        }

        System.out.println(result);
    }
}
