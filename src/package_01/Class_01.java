package package_01;

import package_02.*;

public class Class_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("class: package_01.Class_01.main()");
		
		Class_02 c2 = new Class_02();
		c2.method_01(); 
		
		Class_03 c3 = new Class_03();
		c3.method_01();  
		
		package_02.Class_01 c4 = new package_02.Class_01();
		c4.method_01();   
		
		package_02.Class_02 c5 = new package_02.Class_02();
		c5.method_01();   
	}

}
