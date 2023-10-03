package MethodOverloading;

public class TypeOfArguments {
		
	void show(int a) {
		System.out.println("1");
	}
	
	void show(String name) {
		System.out.println("2");
	}
	
	public static void main(String[] args) {
		TypeOfArguments obj=new TypeOfArguments();
		obj.show(10);
		obj.show("abhi");
		
	}

}
