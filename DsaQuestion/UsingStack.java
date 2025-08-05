import java.util.Stack;

public class UsingStack {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (!stack.contains(ch)) {
                    stack.push(ch);
                }
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = Character.toLowerCase(ch);
                if (!stack.contains(ch)) {
                    stack.push(ch);
                }
            }
        }

        if (stack.size() == 26) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}



