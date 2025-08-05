public class q26 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int[] x = {1, 6, 8, 9, 5};

        int resultIndex = -1;

        for (int i = 0; i < x.length; i++) {
            if (a + x[i] == b) {
                resultIndex = i;
                break;
            }
        }

        if (resultIndex != -1) {
            System.out.println(resultIndex);
        } else {
            System.out.println("No matching element found.");
        }
    }
}
