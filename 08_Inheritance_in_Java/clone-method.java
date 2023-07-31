package Inheritance_in_Java;

class Rectangle implements Cloneable{
	int length;
	int width;
	
	public Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}
	
	public String toString(){
		return "Length: " + length + " Width: " + width;
	}
	
	public static void main(String [] args){
		Rectangle r1 = new Rectangle(10,20);
		try{
			Rectangle r2 = (Rectangle) r1.clone();
			System.out.println(r1);
			System.out.println(r2);
		
			r2.length = 35;
			System.out.println("After Modifying R2 - length");
		
			System.out.println(r1);
			System.out.println(r2);
		}
		catch(CloneNotSupportedException ce){
			System.out.println(ce);
		}
		
	}
		
}



// class Name{
// 	String firstname;
// 	public Name(String fnm){
// 		firstname = fnm;
// 	}
	
// 	public void setName(String fnm){
// 		firstname = fnm;
// 	}
	
// 	public String toString(){
// 			return firstname;
// 	}
// }

// class Student implements Cloneable{
// 	int rollNo;
// 	Name studName;
	
// 	Student(int rollNo, String fnm){
// 		this.rollNo = rollNo;
// 		this.studName = new Name(fnm);
// 	}
	
// 	public void setStudName(String fnm){
// 		this.studName.setName(fnm);
// 	}
	
// 	public Object clone() throws CloneNotSupportedException{
// 		Student temp = (Student) super.clone();
// 		temp.studName = new Name(this.studName.firstname);
// 		return temp;
// 	}
	
// 	public static void main(String args[]){
// 		try{
// 			Student s1 = new Student(101,"Stuti");
			
// 			Student s2 = (Student) s1.clone();
// 			System.out.println(s1.rollNo + " " + s1.studName);
// 			System.out.println(s2.rollNo + " " + s2.studName);
			
// 			s2.rollNo = 102;
// 			s2.setStudName("Stavan");
			
// 			System.out.println(s1.rollNo + " " + s1.studName);
// 			System.out.println(s2.rollNo + " " + s2.studName);
// 		}
// 		catch(CloneNotSupportedException ce){
// 			System.out.println(ce);
// 		}
// 	}
// }