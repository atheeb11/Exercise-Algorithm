import java.util.Scanner;

public class StatisticsCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers separated by space (e.g., 10 20 30):");
        String input = sc.nextLine();
        String[] numbers = input.split(" ");

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        double sum = 0;

        for (String s : numbers) {
            int num = Integer.parseInt(s);
            if (num > max) max = num;
            if (num < min) min = num;
            sum += num;
        }

        System.out.println("Largest: " + max);
        System.out.println("Lowest: " + min);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (sum / numbers.length));
    }
}