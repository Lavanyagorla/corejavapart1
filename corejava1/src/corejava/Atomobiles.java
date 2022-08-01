package corejava;
import java.util.ArrayList;
//import java.util.LinkedList;

public class Atomobiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> car = new ArrayList <String>();
	//	LinkedList<String> car=new LinkedList <>();
		car.add("BMW");
		car.add("volvo");
		car.add("nano");
		car.add("tayota");
		System.out.println(car);
        car.remove(2);
	System.out.println(car);
	    car.set(1," monako");
	    System.out.println(car);
	    car.clear();
	    System.out.println(car);
	}
}
