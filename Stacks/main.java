
public class main {
public static void main(String [] args) {
	 stack newstack=new stack(4);
	 boolean result =newstack.isEmpty();
	 System.out.println(result);
	 boolean result1= newstack.isFull();
	 System.out.println(result1);
	 newstack.push(10);
	 newstack.push(20);
	 newstack.push(30);
	 newstack.push(40);
	 /*int x=newstack.pop();
	 
	 int y=newstack.pop();
	 
	 System.out.println(x);
	 
	 System.out.println(y);*/
	 int peeks=newstack.peek();
	 int peekss=newstack.peek();
	 
	 System.out.println(peeks);
	 System.out.println(peekss);
	 newstack.deletestack();
	 
	 
}
}
