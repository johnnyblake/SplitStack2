import java.util.List;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class SplitStack {
    public static void splitStack(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<>();


        while (!stack.isEmpty()) {
            int num = stack.pop();
            if (num < 0) {
                queue.add(num);
            } else {
                stack.push(num);
            }
        }
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.addAll(List.of(5, -5, 67, -45, 67, 9, 0, -42, 56, -7));

        System.out.println("Original Stack 1: " + stack1);
        splitStack(stack1);
        System.out.println("Split Stack 1: " + stack1);

        Stack<Integer> stack2 = new Stack<>();
        stack2.addAll(List.of(1, -2, -3, 4, -5, 6, -7, 8, -9));

        System.out.println("\nOriginal Stack 2: " + stack2);
        splitStack(stack2);
        System.out.println("Split Stack 2: " + stack2);
    }
}
