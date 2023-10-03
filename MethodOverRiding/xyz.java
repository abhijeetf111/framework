package MethodOverRiding;

public class xyz extends abc{
	
	void show () {
		System.out.println("2");
	}	
	public static void main(String[] args) {
		abc obj=new abc();
		obj.show();
		
		xyz obj1=new xyz();
		obj1.show();
	}
}
