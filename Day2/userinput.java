import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // <className> <ObjextName> = new (keyword) <className>;

        System.out.print("Enter a number : ");
        int a = sc.nextInt(); // This will help us to take user input
        System.out.print("Enter another number : ");
        int b = sc.nextInt(); // This will help us to take user input

        System.out.println("The sum is : " + (a+b));

        sc.close();
    }
}
