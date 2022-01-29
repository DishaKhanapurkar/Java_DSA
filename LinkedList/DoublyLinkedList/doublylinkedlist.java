package doublylinkedlist;

public class doublylinkedlist {

	node head;
	node tail;
	int size;
	public node createdll(int nodevalue)
	{
	   head=new node();
	   node newnode= new node();
	   newnode.value=nodevalue;
	   newnode.prev=null;
	   newnode.next=null;
	   head=newnode;
	   tail=newnode;
	   return head;
	   }
	public void insertdll(int nodevalue,int location )
	{
		node newnode=new node();
		newnode.value=nodevalue;
	    if(head==null)
	    {
	    	createdll(nodevalue);
	    	return;
	    }
	    else if(location==0)
	    {
	    	newnode.next=head;
	    	newnode.prev=null;
	    	head.prev=newnode;
	    	head=newnode;
	    }
	    else if(location>=size)
	    {
	    	newnode.next=null;
	    	tail.next=newnode;
	    	newnode.prev=tail;
	    	tail=newnode;
	    }
	    else {
	    	node tempnode= head;
	    	int index=0;
	    	while(index<location-1) {
	    		tempnode=tempnode.next;
	    		index++;
	    	}
	    	newnode.prev=tempnode;
	    	newnode.next=tempnode.next;
	    	tempnode.next=newnode;
	    	newnode.next.prev=newnode;
	    	
	}
	    size++;
	
	}
	//SIMPLE TRAVERSAL OF DLL
	public void traversal()
	{
		if(head!=null)
		{
			node tempnode=head;
			for(int i=0;i<size;i++)
			{
				System.out.print(tempnode.value);
				if(i!=size-1)
				{
					System.out.print("->");
				}
				tempnode=tempnode.next;
				
			}
			
		}
		else
			System.out.println("DLL DNE");
	
	
	System.out.println("\n");

}
	//REVERSE TRAVERSAL OF DLL
	public void reversetraverse() {
		if(head!=null)
		{
			node tempnode=tail;
			for(int i=0;i<size;i++)
			{
				System.out.print(tempnode.value);
				if(i!=size-1) {
					System.out.print("<-");	
					}
				tempnode=tempnode.prev;//to go backwards
			}
		}
		else
			System.out.println("DLL DNE");	
		System.out.println("\n");
	}
	// SEARCH A NODE VALUE
	
	public boolean searchdll(int nodevalue)
	{
		if(head!=null)
		{
			node tempnode=head;
			for(int i=0;i<size;i++)
			{
				if(tempnode.value==nodevalue)
				{
					System.out.println("Found at="+i);
					return true;
				}
				tempnode=tempnode.next;
			}
		}
		
			System.out.println("node not found");
		return false;
	}
	
	
	//DELETION OF DLL
	public void deletedll(int location) {
		if(head==null) {
			System.out.println("DLL DNE");
			return;
		}
		else if(location==0) {
		    if(size==1) {
		    	head=null;
		    	tail=null;
		    	size--;
		    	return;
		    }
		    else {
		    	head=head.next;
		    	head.prev=null;
		    	size--;
		    }
		}
		else if(location>=size) {//for deleting from last
			node tempnode=tail.prev;
			if(size==1) {
		    	head=null;
		    	tail=null;
		    	size--;
		    	return;
		    }
			else {
				tempnode.next=null;
				tail=tempnode;
				size--;
			}
		}
		else {
			node tempnode=head;
		for(int i=0;i<location-1;i++)
		{
			tempnode=tempnode.next;
		}
		tempnode.next=tempnode.next.next;
		tempnode.next.prev=tempnode;//backward link
		size--;
		}
	}
}

