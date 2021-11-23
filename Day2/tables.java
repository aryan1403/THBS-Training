import java.util.Scanner;

public class tables {
    public static void createTableOf(int num) {
        System.out.println("The Table of " + num + " is : ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        createTableOf(num);
        sc.close();


    }
}
