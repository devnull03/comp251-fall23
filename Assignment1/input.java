
import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int interger = sc.nextInt();

        if (interger % 2 == 0) {
            System.out.println(interger + " is even");
        } else {
            System.out.println(interger + " is odd");
        }

        sc.close();

    }
}
