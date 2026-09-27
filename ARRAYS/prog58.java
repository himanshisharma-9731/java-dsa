interface Stack {
    void push(int x);
    int pop();
    int peek();
}

// Fixed size stack
class FixedStack implements Stack {

    int[] stack;
    int top = -1;

    FixedStack(int size) {
        stack = new int[size];
    }

    public void push(int x) {

        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] = x;
        }
    }

    public int pop() {

        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }

        return stack[top--];
    }

    public int peek() {

        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        return stack[top];
    }
}


// Dynamic size stack
class DynamicStack implements Stack {

    int[] stack;
    int top = -1;

    DynamicStack(int size) {
        stack = new int[size];
    }

    public void push(int x) {

        // If stack is full, increase its size
        if (top == stack.length - 1) {

            int[] newStack = new int[stack.length * 2];

            for (int i = 0; i < stack.length; i++) {
                newStack[i] = stack[i];
            }

            stack = newStack;
        }

        top++;
        stack[top] = x;
    }

    public int pop() {

        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }

        return stack[top--];
    }

    public int peek() {

        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        return stack[top];
    }
}


// Main class
public class prog58 {

    public static void main(String[] args) {

        // Interface reference
        Stack s1 = new FixedStack(3);

        s1.push(10);
        s1.push(20);
        s1.push(30);

        System.out.println("Fixed Stack Peek: " + s1.peek());
        System.out.println("Fixed Stack Pop: " + s1.pop());
        System.out.println("Fixed Stack Peek: " + s1.peek());


        System.out.println();


        // Interface reference
        Stack s2 = new DynamicStack(2);

        s2.push(10);
        s2.push(20);

        // Stack is full, but DynamicStack increases size
        s2.push(30);

        System.out.println("Dynamic Stack Peek: " + s2.peek());
        System.out.println("Dynamic Stack Pop: " + s2.pop());
        System.out.println("Dynamic Stack Peek: " + s2.peek());
    }
}