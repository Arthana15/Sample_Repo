package aggregation;

public class Aggregation2 {
	String city;
	String state;
	Aggregation1 reference;
	
	public Aggregation2(String city,String state,Aggregation1 reference)
	{
		this.city=city;
		this.state=state;
		this.reference=reference;
	}
	
	public void display()
	{
		System.out.println("Name:"+reference.name+" "+"Rollno:"+reference.rollno);
		System.out.println("City:"+city +" "+"State:" +state);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aggregation1 obj=new Aggregation1("Alia",24,22); //invoke parent class constructor
		Aggregation2 obj1=new Aggregation2("Kannur","Kerala",obj); //invoke child class constructor
		obj1.display();

	}

}
