public class Stack {
    int stack[] = new int[5];
    int top = 0;
    public void push (int data  ){ //populates the array with data passed into the method in the main as numbers 
        stack[top]= data;
        top++;
    }
    public int pop (){ //to remove the last value and returns it
        int data;
        top--;
        data = stack [top];
        stack[top]=0;
        return data;
    }
    public int peek(){ //to view the last value
        int data;
        data = stack [top];
        return data;
    }
    public void show(){ //prints the array
        for(int n : stack){
            System.out.println(n + " ");
        }

     }
}
