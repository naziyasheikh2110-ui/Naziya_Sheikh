package java_projects;
import java.util.Scanner;
public class simple_calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number: ");
        double num1 = sc.nextDouble();
        System.out.println("enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("choose the operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double result = 0;

        if (op == '+') {
            result = num1 + num2;
            System.out.println("the addition of given number is " + result);
        } else if (op == '-') {
            result = num1 - num2;
            System.out.println("the substraction of given number is " + result);
        } else if (op == '*') {
            result = num1 * num2;
            System.out.println("the multiplication of given number is " + result);
        }
        else if(op == '/' ) {
            result = num1 / num2;
            System.out.println("the division of given number is " + result);
        }
        else{
            System.out.println("given information is invalid ");
        }
    }
}
