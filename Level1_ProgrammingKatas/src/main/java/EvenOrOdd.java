import java.util.*;

public class EvenOrOdd {

    public static void main(String[] args) {
        int x;
        System.out.println("Please enter your number and check if it's Even or Odd");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();

        if (x % 2 == 0)
            System.out.println("Even.");
        else
            System.out.println("Odd.");
    }
}
