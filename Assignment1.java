import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Assignment 1
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = scan1.nextLine();
        System.out.print("Enter your second name: ");
        String secondName = scan1.nextLine();
        scan1.close();
        String name = firstName.concat(" "+ secondName);
        System.out.println("Your name is: "+ name);
        System.out.println("The first character of your second name is: "+ secondName.charAt(0));

        //Assignment 2
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = scan2.nextLine();
        String first_name = fullName.split(" ")[0];
        System.out.print("Enter your age: ");
        double age = scan2.nextDouble();
        scan2.nextLine();
        System.out.print("Enter your major: ");
        String major = scan2.nextLine();
        System.out.print("Enter your date of birth in (mm-dd-yy) format: ");
        String dateOfBirth = scan2.nextLine();
        String month = dateOfBirth.split("-")[1];
        System.out.println("Your first name is: " + first_name);
        System.out.println("Your age is: " + (int)age);
        System.out.println("Your major is: " + major);
        System.out.println("Your birth month is: " + month);
        scan2.close();

   }
