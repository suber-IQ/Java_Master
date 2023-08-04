package Abstract_Class_And_Interface_In_Java;

class AbstractFinalDemo{
	public static void main(String [] args){
		//FinalClass obj = new FinalClass();
		//obj.f();
		Dervied  obj = new Dervied();
		obj.f();
		obj.g();
		obj.h();
	}
}

// abstract class FinalClass{
// 	public FinalClass(){
// 		System.out.println("FinalClass Instantiated");
// 	}
// 	abstract final public void f(){
// 		System.out.println("F() Called...");
// 	}
// }

// class DerviedFinalClass extends FinalClass{
// 	final public void f(){
// 		System.out.println("F() of Devired Called...");
// 	}
// }


// 👉 with Abstract into final combination (it is Possibly)

abstract class Base{
	abstract public void f();
    final public void g(){
		System.out.println("G called...");
	}
	public void h(){
		System.out.println("H from Base is called...");
	}
}

class Dervied extends Base{
	public void f(){
		System.out.println("F called..");
	}
	public void h(){
		System.out.println("H from yes Base is called..");
	}
	// public void g(){
	// 	System.out.println("G Derived called..");
	// }
}

// 👉 with final into abstract combination (it is not possible to final into abstract combination) 


// final class Base{
// 	// abstract public void f();
//      public void g(){
// 		System.out.println("G called...");
// 	}
// 	public void h(){
// 		System.out.println("H from Base is called...");
// 	}
// }

// class Dervied extends Base{
// 	public void f(){
// 		System.out.println("F called..");
// 	}
// 	public void h(){
// 		System.out.println("H from yes Base is called..");
// 	}
// 	// public void g(){
// 	// 	System.out.println("G Derived called..");
// 	// }
// }

		
