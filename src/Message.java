public class Message {

    public static void start() {
        System.out.println("Hi! Input first number");
    }

    public static void quit() {
        System.out.println("Quiting");
    }

    public static void reset() {
        System.out.println("Reset. Input first number");
    }

    public static void first(int first) {
        String str_first = String.valueOf(first);
        System.out.println(str_first);
    }

    public static void result(int first, char operation, int second, String result) {
        String str_first = String.valueOf(first);
        String str_operation = String.valueOf(operation);
        String str_second = String.valueOf(second);
        System.out.println(str_first + ' ' + str_operation + ' ' + str_second + " = " + result);
    }

    public static void operation(int first, char operation) {
        String str_first = String.valueOf(first);
        String str_operation = String.valueOf(operation);
        System.out.println(str_first + ' ' + str_operation);
    }
}
