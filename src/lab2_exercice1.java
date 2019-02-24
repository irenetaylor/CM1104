import java.util.*;

public class lab2_exercice1 {

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("The Volume of a Cone");
            System.out.print("Please input the cone height: ");
            double height = in.nextDouble();
            System.out.print("Please input the cone base radius: ");
            double radius = in.nextDouble();
            double volume = Math.PI / 3 * radius * radius * height;
            System.out.printf("The volume is %.3f cubic units\n", volume);
//*//
        }
    }

