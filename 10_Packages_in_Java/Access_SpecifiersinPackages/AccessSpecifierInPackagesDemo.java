import mypack.*;

class AnotherPackInheritedClass extends AccessSpecifierDemo1{
	public void set(){
		//pri_i = 10;
		//def_i = 20;
		pro_i = 30;
		pub_i = 40;
	}
}

class AnotherPackStandAloneClass {
	public void set(){
		AccessSpecifierDemo1 obj = new AccessSpecifierDemo1();
		SamePackStandAlone obj2 = new SamePackStandAlone();
		SamePackDerived obj3 = new SamePackDerived();
		//obj.pri_i = 10;
		//obj.def_i = 20;
		//obj.pro_i = 30;
		obj.pub_i = 40;
	}
}