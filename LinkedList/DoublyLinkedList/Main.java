package doublylinkedlist;

public class Main {
	public static void main(String args[])
	{
		doublylinkedlist dl=new doublylinkedlist();
		dl.createdll(10);
		dl.insertdll(20,1);
		dl.insertdll(30,2);
		dl.insertdll(40,3);
		dl.traversal();
		//dl.reversetraverse();
		//dl.searchdll(50);
		dl.deletedll(1);
		dl.traversal();
		/*System.out.println(dl.head.value);
		System.out.println(dl.head.next.value);
		System.out.println(dl.head.next.next.value);
		System.out.println(dl.head.next.next.next.value);*/
		
	}

}
