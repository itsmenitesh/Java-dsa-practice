import java.util.HashSet;

public class dublicateword {
    public static String removeDuplicates(String input) {
        if (input == null) {
            return null;
        }

        StringBuilder result = new StringBuilder();
        HashSet<Character> seenCharacters = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Check if the character is not a space and has not been seen before
            if (currentChar != ' ' && !seenCharacters.contains(currentChar)) {
                seenCharacters.add(currentChar);
                result.append(currentChar);
            } else if (currentChar == ' ') {
                result.append(currentChar);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "hello     world";
        String result = removeDuplicatess(input);
        System.out.println("Original string: " + input);
        System.out.println("String with duplicates removed: " + result);
    }

    public static String removeDuplicatess(String str) {
        if (str == null) {
            return null;
        }

        char[] arr = str.toCharArray();
        HashSet<Character> hs = new HashSet<>();

        int writeIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            char currentChar = arr[i];

            if (currentChar != ' ' && !hs.contains(currentChar)) {
                hs.add(currentChar);
                arr[writeIndex] = currentChar;
                writeIndex++;
            } else if (currentChar == ' ') {
                arr[writeIndex] = currentChar;
                writeIndex++;
            }
        }

        return new String(arr, 0, writeIndex);
    }

}
