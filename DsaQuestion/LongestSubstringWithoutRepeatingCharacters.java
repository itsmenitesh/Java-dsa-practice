<<<<<<< HEAD
import java.io.*;
import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(longestSubstring(str));
    }
    public static int longestSubstring(String str){
        int l=0 , r=0 , max=0, n=str.length();
        HashSet<Character> hs = new HashSet<>();
        while(r<n){
            while(hs.contains(str.charAt(r)))hs.remove(str.charAt(l++));
            max = Math.max(max , r-l+1);
            hs.add(str.charAt(r++));
            
        }
        return max;
    }
=======
import java.io.*;
import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(longestSubstring(str));
    }
    public static int longestSubstring(String str){
        int l=0 , r=0 , max=0, n=str.length();
        HashSet<Character> hs = new HashSet<>();
        while(r<n){
            while(hs.contains(str.charAt(r)))hs.remove(str.charAt(l++));
            max = Math.max(max , r-l+1);
            hs.add(str.charAt(r++));
            
        }
        return max;
    }
>>>>>>> 044385a56256738e7e859f6de7577878e028f71c
}