import java.util.Scanner;

public class Input {

    public static String input_number() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static String input_operation() {
        Scanner scanner = new Scanner(System.in);
        String i = scanner.next();
        if ((i.equals("+")) || (i.equals("-")) || (i.equals("*")) || (i.equals("/"))) return i;
        else {
            Message.operation_error();
            return "s";
        }
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