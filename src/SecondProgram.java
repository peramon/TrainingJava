import java.util.Scanner;

public class SecondProgram {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("What's your name");
        String name = entrada.nextLine();
        System.out.println("Your name is " +name+ " welcome");
        System.out.println("Enter your age");
        int age = entrada.nextInt();
        System.out.println("Your age is "+age+" age's" );
    }
}
