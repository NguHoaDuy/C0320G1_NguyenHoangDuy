package P1javalanguage.thuchanh.debugJava;
import java.util.Scanner;
public class debugJava {
    public static void main(String[] args) {
//        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.println(solve(a, b));
    }
    public static String solve(double a, double b) {
        if(a == 0) {
            if(b == 0) {
                return "The solution is all x";
            } else {
                return "No solution";
            }
        }
        double result = -b / a;
        return  "The solution is " + result;
    }
}
