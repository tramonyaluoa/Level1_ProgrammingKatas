import java.util.*;

public class PatternSquare {

    public static void main(String[] args) {

        int square, i, j;

        Scanner input = new Scanner (System.in);

        System.out.print(" Please Enter any number and print a square : " + "\n");
        square = input.nextInt();                          //user input

        for(i = 1; i <= square; i++){
            for(j = 1; j <= square; j++){
                System.out.print("#");         //Square pattern
            }
            System.out.print("\n");
        }
    }
}