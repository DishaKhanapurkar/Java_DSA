//MADE A STACK AND DEFINED SOME METHODS
public class stack {
	int arr[];
	int topofstack;
	
	public stack(int size) {
		this.arr=new int[size];
		this.topofstack=-1;
		System.out.println("Stack is created with size of : "+size);
	}
	// is Empty
	public boolean isEmpty() {
		if(topofstack==-1)
			return true;
		else
			return false;
}
	// isFull
	public boolean isFull() {
		if(topofstack==arr.length-1)
		{
			System.out.println("Stack is full");
			return true;	
		}
		else
		{
			return false;
		}
	}
	//push
	public void push(int value) {
		if(isFull()) {
			System.out.println("Stack is full");
		}
		else {
			arr[topofstack+1]=value;
		topofstack++;
		System.out.println("Value"+arr[topofstack]+"is inserted");
			}
	}
	public int pop() {
		if(isEmpty())
		{
			System.out.println("Stack is empty");
			return 0;
			
		}
		else {
			int topstack=arr[topofstack];
			topofstack--;
			return topstack;
			
		}
			
	}
	//peek
	public int peek() {
		if(isEmpty())
		{
			System.out.println("Stack is empty");
			return 0;
			
		}
		else
		{
			int peek=arr[topofstack];
			return peek;
		}
	}
	//delete
	public void deletestack() {
		arr=null;
		System.out.println("Stack is successfully deleted");
	}
}
