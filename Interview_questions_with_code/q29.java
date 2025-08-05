
import java.util.*;

public class q29 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {5, 6, 7};

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        for (int value : A) {
            setA.add(value);
        }

        for (int value : B) {
            setB.add(value);
        }

        // Union
        Set<Integer> union = new HashSet<>(setA);
        union.addAll(setB);

        // Intersection
        Set<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);

        // Uncommon values
        Set<Integer> uncommonA = new HashSet<>(setA);
        uncommonA.removeAll(setB);

        Set<Integer> uncommonB = new HashSet<>(setB);
        uncommonB.removeAll(setA);

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
        System.out.println("Uncommon values in A: " + uncommonA);
        System.out.println("Uncommon values in B: " + uncommonB);
    }
}
