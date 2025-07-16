import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /*      *     when i = 1, space = 2 on both sides
                      when i = 3 space = 1
                      when i = 5 space =0
               ***
              *****
         */

        Scanner scan = new Scanner(System.in);
        int num = 0;
        System.out.print("Enter the maximum number of stars(odd number): ");
        boolean correctInput = false;
        boolean flag = true;
        while(flag) {
            while (!correctInput) {

                try {
                    num = Integer.parseInt(scan.next());
                    if (num % 2 == 0 || num <= 0) {
                        System.out.print("Please enter a positive odd number: ");
                    } else {
                        correctInput = true;
                        flag = false;
                    }

                } catch (Exception e) {
                    System.out.print("Enter a number: ");
                    correctInput = false;
                }
            }
        }
            String star = "*";
            String indent = " ";
            int space = (num - 1) / 2;
            for (int i = 1; i <= num; i += 2) {
                System.out.println(indent.repeat(space) + star.repeat(i) + indent.repeat(space));
                space--;
            }
            space = 0;
            for (int i = num-2; i >= 1; i -= 2) {
                System.out.println(indent.repeat(space) + star.repeat(i) + indent.repeat(space));
                space++;
            }
            scan.close();
    }
