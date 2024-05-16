package abstraction;

public abstract class AbstractionExample {

	public AbstractionExample()
	{
		System.out.println("Constructor of abstract class");
	}
	
	public void call()
	{
		System.out.println("Call instance method");
		
	}
	
	public static void receive ()
	{
		System.out.println(" Static method");
	}
	//abstract method declaration
	public abstract void print();
}
