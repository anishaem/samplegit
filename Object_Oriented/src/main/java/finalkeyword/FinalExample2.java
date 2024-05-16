package finalkeyword;

public class FinalExample2 extends FinalExample {

	//can't override a method defined with final 
	/*public final void print()
	{
		System
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// final method can be inherited
		FinalExample2 fd=new FinalExample2();
		fd.print();		
	}

}
