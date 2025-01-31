package abstraction;

public class AbstractionChild extends AbstractionParent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractionChild obj=new AbstractionChild();//object creation
		//AbstractionParent obj=new AbstractionChild();// reference creation for parent class
		obj.display();
		obj.display1();
		

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is the body of parent (override)");
	}
	
	public void display3()
	{
		System.out.println("Child class method");
	}

}
