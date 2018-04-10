/**
 * Created by vivek on 09/04/18.
 */
public class StackWithArray {

    int MAX = 10;
    int top = -1;
    int a[] = new int[MAX];

    public boolean isEmpty() {
        if(top == -1)
            return true;
        else
            return false;
    }

    public boolean push(int element) {
      if(top == MAX-1) {
          System.out.println("Stack Over flow\n");
          return false;
      } else {
          a[++top] = element;
          return true;
      }
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack Under flow\n");
            return 0;
        } else {
            return a[top--];
        }
    }

    public static void main(String[] args) {
        StackWithArray stackWithArray = new StackWithArray();
        stackWithArray.push(12);
        stackWithArray.push(13);
        stackWithArray.push(14);
        stackWithArray.push(15);
        stackWithArray.push(16);
        stackWithArray.push(17);
        stackWithArray.push(18);
        stackWithArray.push(19);
        stackWithArray.push(20);
        stackWithArray.push(21);
        stackWithArray.push(22);
        System.out.println(stackWithArray.pop() + " element poped\n");
        System.out.println(stackWithArray.pop() + " element poped\n");
        System.out.println(stackWithArray.pop() + " element poped\n");
        System.out.println(stackWithArray.pop() + " element poped\n");
        System.out.println(stackWithArray.pop() + " element poped\n");
    }



}





