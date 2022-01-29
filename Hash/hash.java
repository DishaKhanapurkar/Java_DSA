import java.io.*;
import java.util.*;
public class hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> ht1=new Hashtable<>();
		Hashtable<Integer, String > ht2= new Hashtable<Integer,String>();
		ht1.put(1, "one");
		ht1.put(2, "two");
		ht1.put(3, "three");
		ht2.put(4,"four");
		ht2.put(null,null);
		System.out.println("mappings of ht1:"+ht1);
		System.out.println("mappings of ht2:"+ht2);
	}

}
