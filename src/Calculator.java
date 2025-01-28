public class Calculator {
    public static void main(String[] args) {

        double a = 5.2;
        double b = 2;
        char option = '*';
        double result = 0;

        switch (option) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
        }
        System.out.println(result);
    }
}
