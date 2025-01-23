package inheritance;

public class HierarchialChildA extends HierarchialParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchialChildA obj=new HierarchialChildA();
		obj.display();
		obj.display1();

	}

	public void display1()
	{
		System.out.println("Child Class A");
	}
}
