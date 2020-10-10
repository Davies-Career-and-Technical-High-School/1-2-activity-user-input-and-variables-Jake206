import java.util.Scanner;


class Question3 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      System.out.println("Hi there. What is your name?");

      String x = scan.nextLine();

      System.out.println("What adjective describes you?");

      String y = scan.nextLine();

      System.out.println("My name is " + x + ". I am " + y + ".");
     

    }
}