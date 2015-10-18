class X {
	int x;
}

class Y extends X {
	int y;
}

public class LAB05 {
	public static void main(String[] args) {
		
		//PART 1-----------------------------------------------------------------------------------------------------------------------
		X x = new X();
		Y y = new Y();
		x = y;
		//y = x; 				Compile-time error. We can't assign a superclass to a subclass because there might be 
		//						some data that is in a subclass that are not in the superclass.
		//						So we have to cast:
		y = (Y)x;
		X[] xa = new X[5];	//	Array of X's
		Y[] ya = new Y[5];	//	Array of Y's
		xa = ya;			//	(a and b) No error/problem. Can assign an array of the subclass to a reference of a superclass 
		//ya = xa;			//	Compile-time error. The same case with assigning a single object.
		xa = ya;			//	We can assign ya back to xa assuming ya = xa compiles (but in this case, it does not).
		X[] xa1 = new X[5];	//	(c)	
		xa = xa1;
		//ya = xa;			//	Compile-time error. The same with assigning part a and b.
		//PART 1-----------------------------------------------------------------------------------------------------------------------		
		
		//PART 3 (c)
		subclass2.main();
		//PART 4 (a)
		TEST.test();
	}
}

//PART 2-------------------------------------------------------------------------------------------------------------------------------

interface Inter {
	//public int method();				//(a)
	//public int method();				//(b)
	//public void method(int x);		//(c)
	public void method(int x, int y);	//(d)
}

class superclass {
	public void method() {
		System.out.println("superclass!");
	}	
}

class subclass extends superclass implements Inter {
	/*public void method() {
		System.out.println("subclass!");
	}*/ 								//(a,b,c)

	public void method(int a, int b) {
		System.out.println("subclass!");
	}

}

//	(a) Java will compile
//	(b)	Compile-time error. The subclass is not abstract and it does not override the abstract method in the interface 
//		that returns an int.
//		because its implementation in the subclass is in void.
//	(c) Compile-time error. The subclass is not abstract and it does not override the abstract method in the interface 
//		that accepts and int.
//	(d) Java will compile because the names of the parameters does not matter when accepting it. 

//PART 2-------------------------------------------------------------------------------------------------------------------------------

//PART 3-------------------------------------------------------------------------------------------------------------------------------

interface inter2 {
	public static final int x = 0;	
}

class superclass2 {
	public static final int x = 5;		
}

class subclass2 extends superclass2 implements inter2 {
	public static void main() {
		System.out.println(inter2.x);
	}
}

//	(a)	Java will compile even if the constants have different values.
//	(b) Compile-time error. The reference to x is ambiguous. Java will notice when accessing x that it has an implementation
//		in the interface and the superclass. And it doesn't matter if they have the same value. Java has a way to find out.
//	(c)	It turns out that i can actually call a specific x whether its from the interface or from the superclass. accessing
//		it using a '.' operator works. In this solution, i used and printed the x from the interface.

//PART 3-------------------------------------------------------------------------------------------------------------------------------

//PART 4-------------------------------------------------------------------------------------------------------------------------------

class superclass3 {
	public void method() {
		System.out.println("superclass3!");
	}
}

class subclass3 extends superclass3 {
	public void method() {
		System.out.println("subclass3!");
	}
}

class TEST {
	public static void test() {
		subclass3 sub = new subclass3();
		((superclass3)sub).method();
		superclass3 sup = new superclass3();	
		//((subclass3)sup).method();				//run-time error

	}
}

//	(a)	Java calls the subclass method.
//	(b)	Java detects at compile time that we cast a super class to a subclass and lets the error pass. But at run-time
//		Java reviews and we can't call a method on a casted superclass
//	(c)	No. I think there is no way to call the method in the super class without going through the same method in the sub class

//PART 4-------------------------------------------------------------------------------------------------------------------------------
