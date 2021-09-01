import java.util.Scanner;

public class Input {

    public static String input_first() {
        return input();
    }

    public static String input_operation() {
        if ((input() != "+") || (input() != "-") || (input() != "*") || (input() != "/")) {
            Message.operation_error();
            return "s";
        } else {
            return input();
        }
    }

    public static String input_second() {
        return input();
    }

    private static String input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static String calculate(int operand1, char select, int operand2) {

        int result;

        switch (select) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + select);
        }

        return String.valueOf(result);
    }

}