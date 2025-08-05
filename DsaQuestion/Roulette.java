import java.util.Random;

public class Roulette {
    public static void main(String[] args) {
        // Define the possible outcomes on the roulette wheel
        String[] rouletteWheel = {"00", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                "21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
                "31", "32", "33", "34", "35", "36"};

        // Define the colors of the slots on the roulette wheel
        String[] redSlots = {"1", "3", "5", "7", "9", "12", "14", "16", "18", "19", "21", "23",
                "25", "27", "30", "32", "34", "36"};
        String[] blackSlots = {"2", "4", "6", "8", "10", "11", "13", "15", "17", "20", "22",
                "24", "26", "28", "29", "31", "33", "35"};

        // Define a random number generator
        Random rand = new Random();

        // Define a function to simulate a roulette spin
        String spinRoulette(String[] wheel) {
            int index = rand.nextInt(wheel.length);
            return wheel[index];
        }

        // Test the function by simulating 10 roulette spins
        for (int i = 0; i < 10; i++) {
            String result = spinRoulette(rouletteWheel);
            if (contains(redSlots, result)) {
                System.out.println("The ball landed on " + result + ", which is red.");
            } else if (contains(blackSlots, result)) {
                System.out.println("The ball landed on " + result + ", which is black.");
            } else {
                System.out.println("The ball landed on " + result + ", which is green.");
            }
        }
    }

    // Define a function to check if a string is in an array
    static boolean contains(String[] arr, String target) {
        for (String s : arr) {
            if (s.equals(target)) {
                return true;
            }
        }
        return false;
    }
}
