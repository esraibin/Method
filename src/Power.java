import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter base");
        int base = scanner.nextInt();
        System.out.println("Please enter the power");
        int power = scanner.nextInt();
        System.out.println(Math.pow(base,power));

    }
}
