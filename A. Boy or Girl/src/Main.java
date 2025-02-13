import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LinkedList list = new LinkedList();


        for(int i = 0; i < input.length(); i++) {
            list.addNode(input.charAt(i));
        }

        if ((list.length() % 2) == 0){
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

    }

}
