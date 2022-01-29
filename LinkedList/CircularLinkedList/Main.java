
public class Main {
	public static void main(String args[])
	{
		circularlinkedlist cll=new circularlinkedlist();
		cll.createcll(5);
		cll.insertcsll(10, 0);
		cll.insertcsll(20,1);
		cll.insertcsll(30,2);
		cll.travercsll();
		cll.searchcsll(30);
		cll.deletecll(2);
		cll.travercsll();
		cll.deleteall();
		//System.out.println(cll.head.value);
	 //System.out.println(cll.head.next.value);
	 //System.out.println(cll.head.next.next.value);
	}

}
