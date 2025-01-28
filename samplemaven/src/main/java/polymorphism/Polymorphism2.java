package polymorphism;

public class Polymorphism2 extends Polymorphism1 {
	
	public void display(int a,int b)
	{
		int c=a+b;
		System.out.println("Sum of parent:" +c);
		super.display(3, 6);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Polymorphism2 obj=new Polymorphism2();
		obj.display(2, 3);
	}

}
