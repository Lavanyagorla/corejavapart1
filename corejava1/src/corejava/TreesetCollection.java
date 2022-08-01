package corejava;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String>ts=new TreeSet<String>();
		ts.add("lavanya");
		ts.add("ailaiah");
		ts.add("swamy");
		ts.add("theju");
		
		System.out.println("tree set elements is----->"+ts);
		ts.pollFirst();
		System.out.println("tree after poll------>"+ts);
		ts.pollLast();
		System.out.println("tree before poll---->"+ts);
		String s=ts.higher("lavanya");
		System.out.println("higher---->"+ts);
		String s1=ts.lower("swamy");
		System.out.println("lower---->"+ts);
		
		Iterator i=ts.descendingIterator();
		while(i.hasNext())
		{
		System.out.println(i.next());	
		}
		
		

	}

}
