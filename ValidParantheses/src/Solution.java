import java.util.Stack;
class Solution {

    public boolean isValid(String s)
    {
        Stack<Character> stack= new Stack<>();
        for(int i=0 ; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i)== '[') {
                stack.push(c);
            }
            else
            {
                if(stack.empty())
                {
                    return false;
                }
                char top = stack.peek();
                if(top == '(' && c ==')' )
                {
                    stack.pop();
                }
                else if(top == '{' && c =='}' )
                {
                    stack.pop();
                }
                else if(top == '[' && c ==']' )
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }

            }
        }
        if(stack.empty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}