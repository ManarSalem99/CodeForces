import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int trials = input.nextInt();
        input.nextLine();

        for(int i = 0; i < trials; i++) {
            String userInput = input.nextLine();
            System.out.println(countNumberOfOnes(userInput));
        }

        input.close();

    }

    public static int countNumberOfOnes(String input) {
        int numberOfOnes = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1') {
                numberOfOnes++;
            }
        }

        return numberOfOnes;

    }
}