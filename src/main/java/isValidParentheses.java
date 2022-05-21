import java.util.Stack;

public class isValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for(int i = 0 ; i < s.length() ; i++ ){
            char parenteses = s.charAt(i);
            if (parenteses == '(' || parenteses == '{' || parenteses == '[') {
                stack.push(parenteses);
            }else {
                if(stack.isEmpty())
                    return false;
                else if(parenteses == ')'){
                    if ( stack.pop() != '(')
                        return false;
                }else if(parenteses == ']'){
                    if ( stack.pop() != '[')
                        return false;
                }else if(parenteses == '}'){
                    if ( stack.pop() != '{')
                        return false;
                }
            }
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }
}
