    import java.util.Scanner;

    public class IsoleceTriangle{

        public static void main(String args[]){
            Scanner isolece = new Scanner(System.in);
            System.out.println("Please enter a number and print an Isolece Triangle:" +"\n");   //User input

            int size = isolece.nextInt(), x = size, y= size, j, i;


                for(i=1;i<=size;i++) {
                    for(j=1;j<=size*2;j++) {

                        if(j>=x && j<=y) {
                            System.out.print("#");
                            } else {                         // Triangle
                            System.out.print(" ");
                            }
                            System.out.print("");
                    }

                         x--;                       //Shape pattern
                         y++;
                    System.out.println();
                }
            }
        }