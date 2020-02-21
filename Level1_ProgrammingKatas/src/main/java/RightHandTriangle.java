import java.util.*;

public class RightHandTriangle {

    public static void main (String [] args) {

        Scanner input = new Scanner (System.in);

        System.out.print("Please enter a number to print right handed triangle: " + "\n");
        int triangle = input.nextInt(), i, j;

            for (i=0; i<triangle; i++) {
            for (j=0; j<i+1; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

    }

}