package singlylinkedlist;

/**
 * @author Disha
 *
 */

public class sll {
	public node head;
	public node tail;
	public int size;
	public node createsinglylinkedlist(int nodevalue) {
	head=new node();
	node node=new node();
	node.next=null;
	node.value=nodevalue;
	head=node;
	tail=node;
	size=1;
	return head;
	}
	// INSERT VALUE IN SLL AT START END AND GIVEN LOCATION
	public void insertlinkedlist(int nodevalue, int location) {
		node node=new node();
		node.value=nodevalue;
		if(head==null) {
			createsinglylinkedlist(nodevalue);
			return;}
			else if(location==0) {
				node.next=head;
				head=node;
				
			}
			else  if(location>=size)
			{
				node.next=null;
				tail.next=node;
				tail=node;}
			else {
				node tempnode=head;
				int index=0;
				while(index<location-1) {
					tempnode=tempnode.next;
					index++;
				}
				node nextnode=tempnode.next;
				tempnode.next=node;
				node.next=nextnode;
		
		}	
		size++;
	}
	// TRAVERSE A CIRCULAR LINKED LIST
	public void traversesinglylinkedlist() {
		if(head==null) {
				System.out.println("SLL does not exist");		
		}
		else {
			node tempnode=head;
			for(int i=0;i<size;i++)
			{
				System.out.println(tempnode.value);
				if(i!=size-1) {
					System.out.print("->");
				}
				tempnode=tempnode.next;
			}
	}
		
	// SEARCH FOR NODE
System.out.println("\n");
	}
	boolean searchnode(int nodevalue) {
		if(head!=null) {
			node tempnode=head;
			for(int i=0;i<size;i++)
			{
				if(tempnode.value==nodevalue) {
					System.out.println("Found node at location"+i+"\n");
					return true;}
				tempnode=tempnode.next;
				}
			}
		System.out.println("Node not found");
		return false;
		}
	
// DELETING A NODE FROM SINGLE LINKED LIST
	
	public void deletionofnode(int location)
	{ 
		//delete node from start
		if(head==null)
		System.out.println("Single linked does not exists");
		else if( location==0)
		{
			head=head.next;
			size--;
			if(size==0) {
				tail=null;
		                 }
	}
		//delete node from last
		else if(location>=size)
		{
			node tempnode =head;
			for(int i=0;i<size-1;i++)
			{
				tempnode=tempnode.next ;	
			}
			if(tempnode==head) {
				tail=head=null;
			size--;
			return;
			}
			tempnode.next=null;
			tail=tempnode;
			size--;
			}
		//delete node from between
		else {
			node tempnode=head;
			for(int i=0;i<location-1;i++)
			{
				tempnode=tempnode.next;
				
			}
			tempnode.next=tempnode.next.next;//we get node after temp.next
			size--;
		}
	
	
}
	//DELETE WHOLE SINGLY LINKED LIST
	public void delete()
	{
		head=null;
		tail=null;
		System.out.println("Whole list deleted successfully");
	}
}


