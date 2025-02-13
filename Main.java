import java.util.Scanner;

public class Main {

    public static void main (String args[]) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        StringBuilder distinctTxt = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            boolean found = false;
            for (int j = 0; j < distinctTxt.length(); j++) {
                if (distinctTxt.charAt(j) == input.charAt(i)) {
                    found = true;
                    break;
                }
            }

            if (!found)
                distinctTxt.append(input.charAt(i));
        }


        if ((distinctTxt.length() % 2) == 0)
            System.out.println("CHAT WITH HER!");
        else {
            System.out.println("IGNORE HIM!");
        }



    }

}
