
public class circularlinkedlist {
	public node head;
	public node tail;
	public int size;

	//CREATE CIRCULAR SINGLY LINKED LIST
	public node createcll(int nodevalue)
	{
		head=new node();
		node node =new node();
		node.value=nodevalue;
		node.next=node;
		head=node;
		tail=node;
		size=1;
		return head;
	}
	
	//INSERT VALUE IN CIRCULAR SLL
	public void insertcsll(int nodevalue,int location)
	{
		node node=new node();
		node.value=nodevalue;
		if(head==null)
		{
			createcll(nodevalue);
			return;
			
		}
		else if(location==0)
		{
			node.next=head;
			head=node;
			tail.next=head;
			
		}
		else if(location>=size)
		{
			tail.next=node;//our node
			tail=node;
			tail.next=head;
		}
		else
		{
			node tempnode=head;
			int index=0;
		    while(index<=location-1)
		    {
		    	tempnode=tempnode.next;
		    	index++;
		    }
		    node.next=tempnode.next;
		    tempnode.next=node;
		    
		}
		size++;
			
			
			
	}
	// TRAVERSE IN CSLL
	public void travercsll()
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
			System.out.println("\n");
		}
		else
			System.out.println("CLL DOES NOT EXISTS");
	}
	//SEARCH A NODE IN CSLL
	public boolean searchcsll(int nodevalue)
	{
		if(head!=null)
		{
		node tempnode=head;
		for(int i=0;i<size;i++)
		{
			
			if(tempnode.value==nodevalue) {
				System.out.println("Node found at :"+i);
				return true;
			}
			tempnode=tempnode.next;
		}
				
			}
		System.out.println("Node not found");
		return false;
	}
	
	public void deletecll(int location)
	{
		if(head==null)
		{
			System.out.println("CLL DNE");
			return;
		}
		else if(location==0)
		{
			head=head.next;
			tail.next=head;
			size--;
			if(size==0)
			{
				tail.next=head=null;
			}
		}
		else if(location>=size)
		{
			node tempnode=head;
			for(int i=0;i<size-1;i++)
			{
				tempnode=tempnode.next;
			}
			if(tempnode==head)
			{
				head.next=null;
				head=null;
				tail=null;
				return;
			}
			tempnode.next=head;
			tail=tempnode;
			size--;
		}
		else
		{
			node tempnode=head;
			for(int i=0;i<location-1;i++)
			{
				tempnode=tempnode.next;
			}
			tempnode.next=tempnode.next.next;
			size--;
		}
	}
	public void deleteall()
	{
		if(head==null)
		{
			System.out.println("CSLL DNE");
		}
		else
		{
			head=null;
			tail.next=null;
			tail=null;
			
			System.out.println("CSLL Deleted seuccessfully");
		}
	}

}
