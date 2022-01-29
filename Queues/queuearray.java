package queue;

public class queuearray {
               int [] arr;
               int topofqueue;
               int beginningofqueue;
               
               
    public queuearray(int size) {
    	this.arr=new int[size];
    	this.topofqueue=-1;
    	this.beginningofqueue=-1;
    	System.out.println("Queue created :)");
    }
    public boolean isFull() {
    	if(topofqueue==arr.length-1) {
    		return true;
    		
    	}
    	else
    		return false;
    }
    public boolean isEmpty() {
    	if((beginningofqueue==-1)|| (beginningofqueue==arr.length)) {
    		return true;
    	}
    	else
    		return false;
    }
    //ENQUEUE
    public void enqueue(int value) {
    	if(isFull()) {
    		System.out.println("QUEUE IS FULL");	
    	}
    	else if(isEmpty()) {
    		beginningofqueue=0;
    		topofqueue++;
    		arr[topofqueue]=value;
    		System.out.println("Value successfully inserted");
    	}
    	else {
    		topofqueue++;
    		arr[topofqueue]=value;
    		System.out.println("Value successfully inserted");
    }
}
    public int dequeue() {
    	if(isEmpty()) {
    		System.out.println("Queue is empty");
    		return 0;
    	}
    	else {
    		int result=arr[beginningofqueue];
    	    beginningofqueue++;
    	    if(beginningofqueue>topofqueue) {
    	    	beginningofqueue=-1;
    	    	topofqueue=-1;
    	    }
    	    return result;
    	
    	}
    }
     // PEEK
    	public int peek() {
    		if(!isEmpty()) {
    			return arr[beginningofqueue];
    		}
    		else
    			System.out.println("queue is empty");
    			return 0;
    	
    }
    	public void delete()
    	{
    		arr=null;
    		System.out.println("Queue deleted");
    	}
}
