package JavaInterviewQuestions;

import java.util.Stack;

public class StackImplementation {

    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        //pop element from stack
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
