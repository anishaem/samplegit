package abstraction;

public class NonAbstract extends AbstractionExample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AbstractionExample a =new AbstractionExample(); cannot instantiate abstract class
NonAbstract c =new NonAbstract();
c.print();
//call static method
AbstractionExample.receive();
//
//NonAbstract n=new NonAbstract(); via object of child class method of parent and child can be received

//NonAbstract ob=new AbstractionExample();
AbstractionExample ob =new NonAbstract();//via object of parent method of parent can only be received
//when child class's object is created parent class constructor is invoked
ob.call();

	}

	@Override
	public void print() {
	
		System.out.println("Message is received");
		
	}
	

}
