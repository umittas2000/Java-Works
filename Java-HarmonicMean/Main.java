public class Main {

    public static void main(String[] args) {

        int[] numbers = {2, 4, 6, 8, 10};
        double sum = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            sum += 1.0 / numbers[i];
        }

        System.out.println("Harmonic Mean: " + (numbers.length / sum));

    }
}
