// 5.Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
import java.util.*;

public class sumOfNno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            System.out.print("Enter a number or 'x' to finish: ");
            if (sc.hasNextInt()) {
                list.add(sc.nextInt());
            } else {
                String input = sc.next();
                if (input.equals("x")) {
                    int sum = list.stream().mapToInt(Integer::intValue).sum();
                    System.out.println("The Total is: " + sum);
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a number or 'x'.");
                }
            }
        }
        sc.close();
    }
}

