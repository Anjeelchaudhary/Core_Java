package AlgoForExam;

public class Stack {

    public static void stPushPop() {

        //for push operation in stack
        if(top == N-1) {
            display("Stack is full");
            return;
        }

        top = top +1;
        Stack[top] = data;
        Stop;



        //for pop operatioon in stack
        if(top == null) {
            display("Stack is empty");
            return;
        }

        int value = Stack[data];
        int top = top - 1;
        Stop;
    }
    public static void main(String[] args) {
        
    }
}
