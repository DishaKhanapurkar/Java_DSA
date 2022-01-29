package singlylinkedlist;

public class Main {
	public static void main(String[] args) {
		sll sl=new sll();
		//System.out.println(sl.head.value);
		sl.createsinglylinkedlist(5);
		sl.insertlinkedlist(6, 1);
		sl.insertlinkedlist(8, 4);
		sl.insertlinkedlist(7, 3);
		sl.insertlinkedlist(9, 5);
		sl.traversesinglylinkedlist();
		//sl.searchnode(7);
		//sl.deletionofnode(3);
		sl.traversesinglylinkedlist();
		//sl.insertlinkedlist(6, 1);
		//System.out.println(sl.head.next.next.value);
		sl.delete();
	}

}
