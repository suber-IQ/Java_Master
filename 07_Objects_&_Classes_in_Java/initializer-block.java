class InitializerBlockDemo{
	private int i=0;
	public InitializerBlockDemo(){
		i++;
		System.out.println("Inside Constructor: "+i);
	}
	
	{
		i++;
		System.out.println("Initializer Block 1: "+i);
	}
	
	{
		i++;
		System.out.println("Initializer Block 2: " + i);
	}
	
	public static void main(String [] args){
		System.out.println("Main Started");
		InitializerBlockDemo obj1 = new InitializerBlockDemo();
		System.out.println("Main Mid Way");
		InitializerBlockDemo obj2 = new InitializerBlockDemo();
		System.out.println("Main End");
	}
}



// class StaticInitializerBlockDemo{
// 	private int i=0;
// 	private static int j = 1;
// 	public static void main(String [] args){
// 		System.out.println("Main Started");
// 		StaticInitializerBlockDemo obj1 = new StaticInitializerBlockDemo();
// 		System.out.println("Main End");
// 	}
	
// 	{
// 		i++;
// 		System.out.println("Initializer Block - 1: "+ j);
// 	}
// 	{
// 		i++;
// 		System.out.println("Initializer Block - 2:" + i);
// 	}
	
// 	public StaticInitializerBlockDemo(){
// 		i++;
// 		System.out.println("Inside Constructor: "+ i);
// 	}
	
// 	static{
// 		j++;
// 		System.out.println("Static Initializer Block - 1: " + j);
// 	}
	
// 	static {
// 		System.out.println("Static Initializer Block - 2");
// 	}
// }