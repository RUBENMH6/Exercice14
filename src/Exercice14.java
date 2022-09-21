import java.util.Scanner;

public class Exercice14 {

    public static void main(String[] args) {
        int x,y,z;
        Scanner input= new Scanner(System.in);

        System.out.println("Enter a number:");
        x = input.nextInt();
        System.out.println("Enter a other number:");
        y = input.nextInt();
        System.out.println("Enter a last number");
        z = input.nextInt();

        if (x <= y && y <= z) {
            System.out.println("Order is: " + x + ", " + y + " and " + z );
        } else if (x <= z && z <= y) {
            System.out.println("Order is: " + x + ", " + z + " and " + y);
        } else if (y <= z && z <= x){
            System.out.println("Order is: " + y + ", " + z + " and " + x );
        } else if (y <= x && x <= z) {
            System.out.println("Order is: " + y + ", " + x + " and " + z );
        } else if (z <= x && x <= y) {
            System.out.println("Order is: " + z + ", " + x + " and " + y );
        } else {
            System.out.println("Order is: " + z + ", " + y + " and " + x );
        }
    }
}
