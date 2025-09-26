package com.sk.java8.methodReference;

@FunctionalInterface
interface I1{
	void m1();
}

interface I2{
	void m2(String s);
}

interface I3{
	String m3(String s);
}

class ClassX{
	
	ClassX(){
		System.out.println("ClassX.ClassX()-0 param constructor");
	}
	
ClassX(String s){
		System.out.println("ClassX.ClassX()-1 param constructor->"+s);
	}

  static void x1() {
	   System.out.println("ClassX.x1()-0 param static method called");
   }
  
  static void x1(String s) {
	  System.out.println("ClassX.x1() parameterized static method->"+s);
  }
  
  
  void x2() {
	  System.out.println("ClassX.x2()-0 param non static method called");
  }
  
  void x2(String s) {
	  System.out.println("ClassX.x2() parameterized non static method called->"+s);
  }
  
 static String x3(String s) {
	 return s;
 }
 
 String x4(String s) {
	 return s;
 }
}

public class Test1 {

	public static void main(String[] args) {
		
		I1 i11 = ClassX::x1;  //static method reference
		i11.m1();
		System.out.println(".............................\n");
		
		I1 i12 = new ClassX()::x2;  //non static method reference
		i12.m1();
		System.out.println(".............................\n");
		
		I1 i13 = ClassX::new; //constructor reference
		i13.m1();
		System.out.println(".............................\n");
		
		I2 i21 = ClassX::x1; //static method reference parameterized method
		i21.m2("suraj");
		System.out.println(".............................\n");
		
		I2 i22 = new ClassX()::x2;//non static method reference with parameterized method
		i22.m2("koli");
		System.out.println(".............................\n");
		
		I2 i23 = ClassX::new;//parameterized constructor method reference
		i23.m2("java");
		System.out.println(".............................\n");
		
		I2 i24 = System.out::println;//System.out is the object and print is the method
		i24.m2("hyderabad");
		System.out.println(".............................\n");
		
		I3 i31 = ClassX::x3;//return type static method reference 
		System.out.println(i31.m3("naresh it"));
		System.out.println(".............................\n");
		
		I3 i32 = new ClassX()::x4;    // return type non static method reference
		System.out.println(i32.m3("ameerpet"));
		System.out.println(".............................\n");
		
		I3 i33 = String::toUpperCase;
		System.out.println(i33.m3("method referencing"));
		
		//we can not return any thing from constructor that's why we can not able to 
		//perform constructor method referencing which methods of functional interface
		//having return type methods
		
	}
}
