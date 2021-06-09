
import java.util.Stack;

public class Q44_PreFix_Evaluator {

    public static int evaluate(int a, int b, char operator){
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return b - a;
            case '*':
                return a * b;
            case '/':
                if (a == 0)
                    throw new
                            UnsupportedOperationException("Cannot divide by zero");
                return b / a;
        }
        return 0;
    }
    public static int convert(String expression) {
    	
       StringBuilder input = new StringBuilder(expression);
        input.reverse();

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if(c==' ')
                continue;

            if (c == '*' || c == '/' || c == '^' || c == '+' || c == '-') {
            	int s1 = stack.pop();
            	int s2 = stack.pop();
            	int temp = evaluate(s2, s1, c);
                stack.push(temp);
            } else {
               
                StringBuffer temp = new StringBuffer();
                while(Character.isDigit(c)) {
                    temp.append(c);
                    i++;
                    c = input.charAt(i);
                }
                i--;
              
                int num = Integer.parseInt(temp.reverse().toString());
                stack.push(num);
            }
        }
        int result = stack.pop();
        return result;
    }

    public static void main(String[] args) {
        String exp = "- / * 20 * 50 + 3 6 300 2";
        System.out.println(convert(exp));
    }
}