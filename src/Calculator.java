public class Calculator {
    public static void main(String[] args) {

        result_return();
    }

    private static void result_return() {
        Message.start();
        int first = Integer.parseInt(Input.input_first());

        do {
            Message.first(first);
            char operation = Input.input_operation().charAt(0);
            if (operation == 's') {
                Message.quit();
                break;
            } else if (operation == 'c') {
                Message.reset();
                first = Integer.parseInt(Input.input_first());
                continue;
            }
            Message.operation(first, operation);

            int second = Integer.parseInt(Input.input_second());
            String str_second = String.valueOf(second);
            if (str_second.equals("s")) {
                Message.quit();
                break;
            } else if (str_second.equals("c")) {
                Message.reset();
                first = Integer.parseInt(Input.input_first());
                continue;
            }

            String result = Input.calculate(first, operation, second);
            Message.result(first, operation, second, result);
            first = Integer.parseInt(result);
        } while (true);
    }
}






