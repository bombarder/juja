package ua.com.juja.jujarobot;


public class Parser {
    public static int eval(String expr) {
        return eval(expr, 0, expr.length());
    }

    private static int eval(String expr, int from, int to) {
        if (expr.charAt(to - 1) == ')') {
            return eval(expr, from + 1, to - 1);
        } else {
            int pos = to - 1;
            while (pos > from) {
                if (Character.isDigit(expr.charAt(pos))) {
                    pos--;
                } else {
                    int right = Integer.valueOf(expr.substring(pos + 1, to));
                    char operation = expr.charAt(pos);
                    int left = eval(expr, from, pos);
                    switch (operation) {
                        case '+': return right + left;
                        case '-': return left - right;
                        case '*': return right * left;
                        case '/': return left / right;
                    }
                }
            }
            return Integer.valueOf(expr.substring(from, to));
        }
    }
}

