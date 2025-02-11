import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // print hello world
        //System.out.println("Hello World!");

        System.out.println("Enter your name: ");


        // scan user input
        Scanner inputScanner = new Scanner(System.in);
        String name = inputScanner.nextLine();

        System.out.println("Hello " + name + "!");
    }
}

