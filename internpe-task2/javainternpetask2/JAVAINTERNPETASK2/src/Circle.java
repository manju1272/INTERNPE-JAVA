import java.util.*;

public class Circle {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter radius of circle : ");
            double rds = in.nextDouble();
            double prmt = 2 * Math.PI * rds;
            double area = Math.PI * rds * rds;
            System.out.println("Perimeter is " + prmt);
            System.out.println("Area is " + area);
        }
    }
}
