package Inheritance_in_Java;


class ConstructorCallDemo1 {
	public static void main(String [] args){
		Derived dObj = new Derived();
		dObj.printIJ();
		C cObj = new C(10);
	}
}



class Base{
	protected int i;
	public Base(){
		System.out.println("Base Default Constructor Called");

		this.i = 15;
	}
	// public Base(int i){
	// 	System.out.println("Base Parameterized Constructor Called");
	// 	this.i = i;
	// }
	public void printI(){
		System.out.println(i);
	}
}

class Derived extends Base{
	int j;
	
	public Derived(){
		// super(i);
		System.out.println("Derived Constructor Called");
		this.j = 50;
	}
	
	public void printIJ(){
		System.out.println("I:" + i);
		System.out.println("J:" + j);
	}
}




class A{
	public A(int i){
		i = 10;
		System.out.println("A Constructor Called");
	}
}

class B extends A{
	public B(int j){
		j = 10;
		super(10);
		System.out.println("B Constructor Called");
	}
}

class C extends B{
	public C(int k){
		super(10);
		k = 10;
		System.out.println("C Constructor Called");
	}
}