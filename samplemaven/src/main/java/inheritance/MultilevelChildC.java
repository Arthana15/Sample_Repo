package inheritance;

public class MultilevelChildC extends MultilevelParentB{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelChildC obj=new MultilevelChildC();
		obj.display2();
		obj.display1();
		obj.display();
	}
	
	public static void display2()
	{
		System.out.println("Child Class");
	}

}
