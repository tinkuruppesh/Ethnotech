import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units: ");
        int units = sc.nextInt();
        if ((units ^ 250) == 0) {
            System.out.println("No need to pay the bill");
        }
        else if (units > 250) {
            int bill = (units - 250) * 5;
            System.out.println("Pay the bill");
            System.out.println("Bill amount = " + bill);
        }
    }
}