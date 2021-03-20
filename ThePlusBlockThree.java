import java.util.Scanner;

// Working Plus block program//
public class ThePlusBlockThree {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the width");
        int width = scan.nextInt();
        System.out.println("Enter the height");
        int height = scan.nextInt();

        for (int i = 1; i <= height; i++) {

            if (i != height / 2 + 1) {
                for (int j = 1; j <= width; j++) {
                    if (j == (width / 2 + 1)) {
                        System.out.print(" ");
                    } else {
                        System.out.print("#");
                    }

                }
            }
            System.out.println();
        }
        scan.close();
    }

    /*
     * I fixed the width and the heights parameteres. Created conditionals for plus
     * sign in the printed block!
     */

}