package inheritance;

public class HierarchialChildB extends HierarchialParent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchialChildB obj=new HierarchialChildB();
		obj.display2();
		obj.display();

	}
	public void display2()
	{
		System.out.println("Child Class B");
	}
}
