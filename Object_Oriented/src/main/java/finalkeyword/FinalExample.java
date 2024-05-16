package finalkeyword;

public class FinalExample {

	final int a=10;
	//value of final variable can be changed via constructor else initialise at declaration
	/*public FinalExample()
	{
		a=10;
	}*/
	
	public final void print()
	{
		System.out.println("final method");
	}
	public static void main(String[] args) {
		
		FinalExample f=new FinalExample();
		
		System.out.println(f.a);
		f.print();
	}

}
