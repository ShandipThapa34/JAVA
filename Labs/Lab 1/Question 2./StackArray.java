class Stack
{
	int stackArray[];
	int size;
	int top = 0;
	public Stack(int size)
	{
		this.size = size;
		stackArray = new int[size];
	}
	public boolean isEmpty()
	{
		if(top == 0)
		{
			return true;
		}
		return false;
	}
	public boolean isFull()
	{
		if(top == size)
		{
			return true;
		}
		return false;
	}
	public void push(int data)
	{
		if(isFull())
		{
			System.out.println("Stack is full!!");
		}
		System.out.println(data + " is pushed.");
		stackArray[top] = data;
		top++;
	}
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty!!");
		}
		System.out.println(stackArray[top-1] + " is popped.");
		top--;
		stackArray[top] = 0;
	}
	public void topOfStack()
	{
		System.out.println("The top of stack is:" + stackArray[top-1]);
	}
	public void viewStack()
	{	
		System.out.print("Elements in stack are:");
		for(int i = 0; i<top; i++)
		{
			System.out.print(stackArray[i] + ", ");
		}
		System.out.println("\n");
	}
}

class StackArray
{
	public static void main(String[] args)
	{
		Stack stack = new Stack(3);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.viewStack();
		stack.pop();
		stack.viewStack();
		stack.topOfStack();
	}
}