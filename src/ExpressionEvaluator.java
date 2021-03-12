/*
 * Lab Chapter 6
 * Description: This program asks for an operand and operands and calculates accordingly.
 * Name: Sebastian Wcislo
 * ID: 921575444
 * Class: CSC 211-02
 * Semester: Spring 2021
 */
import java.util.Scanner;

public class ExpressionEvaluator {
    //Our adding method.
    public static double add(double op1, double op2) {
        return op1 + op2;
    }

    //Our subtracting method.
    public static double subtract(double op1, double op2) {
        return op1 - op2;
    }

    //Our multiply method.
    public static double multiply(double op1, double op2) {
        return op1 * op2;
    }

    //Our divide method.
    public static double divide(double op1, double op2) {
        return op1 / op2;
    }

    //Our power method.
    public static double power(double op1, double op2) {
        double result=1;
        //Here we will run a for loop op2 amount of times, multiplying op1 by itself that amount of times.
        for (int i = 1; i <= op2; i++) {
            result = result * op1;
        }
        return result;
    }

    //Our getResultText method.
    public static void getResultText(double op1, double op2, char op) {
        //Here we format the string, without the result.
        System.out.print(op1 + " " + op + " " + op2 + " = ");

        //Here we use a switch case to print the string result
        switch (op) {
            case '+':
                System.out.print(ExpressionEvaluator.add(op1, op2));
                break;
            case '-':
                System.out.print(ExpressionEvaluator.subtract(op1, op2));
                break;
            case '*':
                System.out.print(ExpressionEvaluator.multiply(op1, op2));
                break;
            case '/':
                System.out.print(ExpressionEvaluator.divide(op1, op2));
                break;
            case '^':
                System.out.print(ExpressionEvaluator.power(op1, op2));
                break;
        }
    }

    //Our isValidOperator method.
    public static boolean isValidOperator(char op) {
        //Here we use a switch statement to test whether the operand is valid. Break statements are not necessary because of the return statements.
        switch (op) {
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
                return true;
            default:
                return false;
        }
    }
    //Our main method.
    public static void main(String[] args) {

        //We call the instance of the input stream to use.
        Scanner input = new Scanner(System.in);
        //We call variables that we will be using for this program.
        double op1, op2;
        char op;

        //Our greeting message and prompting the user for operands and operand.
        System.out.println("Welcome to my Expression Evaluator!");
        System.out.println("Enter an operand:");
        op1 = input.nextDouble();
        System.out.println("Enter an operand:");
        op2 = input.nextDouble();
        System.out.println("Enter an operand(+,-,*,/,^):");
        op = input.next().charAt(0);

        //Now we process the request.
        System.out.println("Checking if '" + op + "' is a valid operator...");
        if (ExpressionEvaluator.isValidOperator(op)==true) {
            //We run getResultText if operator is valid.
            System.out.println("'" + op + "' is a valid operator!");
            ExpressionEvaluator.getResultText(op1, op2, op);
        } else {
            //Otherwise we tell the user the operator was invalid and end the program.
            System.out.println("'" + op + "' is NOT a valid operator!");
        }
        //Closing scanner at the end of the program.
        input.close();
    }
}
