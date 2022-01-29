package queue;

public class main {
	public static void main(String [] args) {
    queuearray newqueue =new queuearray(5);
	/*boolean result=newqueue.isFull();
	System.out.println(result);*/
	newqueue.enqueue(10);
	newqueue.enqueue(20);
	newqueue.enqueue(30);
	newqueue.enqueue(40);
	/*int result=newqueue.dequeue();
	System.out.println(result);*/
	/*boolean result=newqueue.isEmpty();
	System.out.println(result);*/
	/*int result1=newqueue.dequeue();
	System.out.println(result1);*/
	int res=newqueue.peek();
	System.out.print(res);
	int res2=newqueue.peek();
	System.out.print(res2);


	
	
	}
	
	
}
