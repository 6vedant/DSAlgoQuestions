import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {



        // {()}()
        // balanced, or not balanced

        String str = "[()]{}{[()()]()}";

        boolean isBalanced = isBal(str);
        System.out.println(isBalanced);



    }

    static boolean isBal(String str) {
        boolean bool = false;
        Stack<Character> stack = new Stack<>();

        // code -> stack.push(), stack.pop(), stack.peek() , stack.isEmpty()

        for(int i=0; i< str.length();i++){
            char ch = str.charAt(i);
            if(stack.isEmpty()){
                stack.push(ch);

            }else if(ch == '{' || ch == '(' || ch == '['){
                stack.push(ch);
            }else if(ch == '}' || ch ==')' || ch == ']'){

                char top = stack.peek();
                if(top == '{' && ch == '}'){
                    stack.pop();
                }else if(top == '(' && ch == ')'){
                    stack.pop();
                }else if(top == '[' && ch == ']'){
                    stack.pop();
                }else{
                    return false;
                }

            } else{
                return false;
            }

        }

        if(stack.isEmpty()){
            return true;
        }

        return false;

    }
}
