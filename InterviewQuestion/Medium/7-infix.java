import java.util.*;
public class Main {
    public static void evaluate(String s) {
        char token[] = s.toCharArray();
        Stack<Character> operator = new Stack<>();
        Stack<Integer> operand = new Stack<>();

        for (int i = 0; i < token.length; i++) {
            if (token[i] >= '0' && token[i] <= '9') {
                operand.push(Integer.parseInt(token[i] + ""));
            } else if (token[i] == '+' || token[i] == '-' || token[i] == '*' || token[i] == '/') {
                // While top of 'operator' has same or greater precedence to current token
                // Apply operator on top of 'operand' to top two elements in values stack
                while (!operator.isEmpty() && precedence(token[i], operator.peek())) {
                    operand.push(solve(operand.pop(), operand.pop(), operator.pop()));
                }
                operator.push(token[i]);
            }
        }

        // Apply remaining operators to remaining operands
        while (!operator.isEmpty()) {
            operand.push(solve(operand.pop(), operand.pop(), operator.pop()));
        }

        // Top of 'values' contains the result, return it
        System.out.print(operand.pop());
    }

    public static boolean precedence(char op1, char op2) {
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }

    public static int solve(int a, int b, char op) {
        switch (op) {
            case '+': return b + a;
            case '-': return b - a;
            case '*': return b * a;
            case '/': return b / a;
        }
        return 0;
    }

    public static void main(String[] args) {
        String s = "2+3-4/2";
        evaluate(s);
    }
}
