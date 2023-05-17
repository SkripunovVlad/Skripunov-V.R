import java.io.*;
import java.util.*;
public class Calculator {
    private static final String FILE_NAME = "history.txt";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите уравнение или введите 'выход', чтобы выйти:");
            String equation = scanner.nextLine().trim();
            if (equation.equals("выход")) {
                System.out.println("Пока!");
                break;
            }
            if (equation.equals("история")) {
                printHistory();
                continue;
            }
            try {
                double result = evaluate(equation);
                System.out.println(equation + " = " + result);
                saveToFile(equation, result);
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }
    private static double evaluate(String equation) {
        Stack<Double> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < equation.length(); i++) {
            char c = equation.charAt(i);
            if (c == ' ') {
                continue;
            }
            if (Character.isDigit(c)) {
                StringBuilder sb = new StringBuilder();
                sb.append(c);

                while (i + 1 < equation.length() && (Character.isDigit(equation.charAt(i + 1)) || equation.charAt(i + 1) == '.')) {
                    sb.append(equation.charAt(i + 1));
                    i++;
                }
                operands.push(Double.parseDouble(sb.toString()));
            } else if (c == '+' || c == '-' || c == '*' || c == '/' || c == '%' || c == '^') {
                while (!operators.empty() && hasPrecedence(c, operators.peek())) {
                    char op = operators.pop();
                    double num2 = operands.pop();
                    double num1 = operands.pop();
                    operands.push(applyOperator(num1, num2, op));
                }
                operators.push(c);
            } else if (c == '|') {
                int start = i + 1;
                int end = equation.indexOf('|', start);
                if (end == -1) {
                    throw new IllegalArgumentException("Отсутствует закрывающий '|' для абсолютного значения в позиции" + (i + 1));
                }
                String numStr = equation.substring(start, end);
                double num = Double.parseDouble(numStr);
                operands.push(Math.abs(num));
                i = end;
            } else if (c == '(') {
                operators.push(c);
            } else if (c == ')') {
                while (operators.peek() != '(') {
                    char op = operators.pop();
                    double num2 = operands.pop();
                    double num1 = operands.pop();
                    operands.push(applyOperator(num1, num2, op));
                }
                operators.pop();
            } else {
                throw new IllegalArgumentException("Недопустимый символ '" + c + "' в позиции " + (i + 1));
            }
        }
        while (!operators.empty()) {
            char op = operators.pop();
            double num2 = operands.pop();
            double num1 = operands.pop();
            operands.push(applyOperator(num1, num2, op));
        }
        if (operands.size() != 1) {
            throw new IllegalArgumentException("Неверное уравнение: " + equation);
        }

        return operands.pop();
    }
    private static boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')') {
            return false;
        }
        if ((op1 == '*' || op1 == '/' || op1 == '%') && (op2 == '+' || op2 == '-')) {
            return false;
        }
        if (op1 == '^' && (op2 == '*' || op2 == '/' || op2 == '%' || op2 == '+' || op2 == '-')) {
            return false;
        }
        return true;
    }
    private static double applyOperator(double num1, double num2, char op) {
        switch (op) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    throw new IllegalArgumentException("Деление на ноль");
                }
                return num1 / num2;
            case '%':
                if (num2 == 0) {
                    throw new IllegalArgumentException("По модулю, равному нулю");
                }
                return num1 % num2;
            case '^':
                return Math.pow(num1, num2);
            default:
                throw new IllegalArgumentException("Недопустимая функция: " + op);
        }
    }
    private static void saveToFile(String equation, double result) {
        try (PrintWriter out = new PrintWriter(new FileWriter(FILE_NAME, true))) {
            out.println(equation + " = " + result);
        } catch (IOException e) {
            System.out.println("Не удалось сохранить историю в файл:" + e.getMessage());
        }
    }
    private static void printHistory() {
        try (BufferedReader in = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Не удалось прочитать историю из файла:" + e.getMessage());
        }
    }
}
