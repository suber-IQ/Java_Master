package Inheritance_in_Java;

class FinalDemo1{
	public static void main(String args[]){
		Base b1 = new Base();
		Derived d1 = new Derived();
	
		d1.print();
		
	}
}

class Base{
	protected final int f_i;  // f_i = 10;
	protected int j;
	{
		f_i = 10;
	}
		Base(){
			System.out.println("Base Created");
		}
		
		final public void print(){
			System.out.println("Hello From Base");
		}
			
}

class Derived extends Base{
	Derived (){
		System.out.println("Derived Created");
	}
	/*public void print(){
			System.out.println("Hello From Derived");
		}*/
	
}