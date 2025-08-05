import java.util.*;

public class q32 {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(7,4,8,9,3,1,4,5,3,3,21,4,5,3,2,14,4,56,2,1,1,1);

        int max = isMax(al);
        System.out.println("Maximum element in the list: " + max);

        int[] arr = {7,4,8,9,3,1,4,5,3,3,21,4,5,3,2,14,4,56,2,1,1,1};
        int firstNonRepeated = isFirstNonRepeated(arr);
        System.out.println(firstNonRepeated);
    }


    public static int isFirstNonRepeated(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : arr) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            if (hm.get(num) == 1) {
                return num;
            }
        }
      return -1;
    }
    public static int isMax(List<Integer> al) {
        if (al == null || al.isEmpty()) {
            throw new IllegalArgumentException("null.");
        }
        int max = Integer.MIN_VALUE;
        for (int num : al) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}

