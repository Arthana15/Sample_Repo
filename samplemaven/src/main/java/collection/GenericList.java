package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s=new ArrayList<String>();
		s.add("White");
		s.add("Green");
		s.add("Blue");
		s.add("Orange");
		s.add("Pink");
		s.add("Yellow");
		s.add("Orange");
		System.out.println("Colors:" +s);
		System.out.println(s.get(2));
		s.set(2, "Pink");
		System.out.println(s);
		System.out.println(s.indexOf("Orange"));
		System.out.println(s.lastIndexOf("Orange"));
		s.remove(5);
		System.out.println(s);
		System.out.println(s.contains("Pink"));
		System.out.println(s.contains("Violet"));
	}

}
