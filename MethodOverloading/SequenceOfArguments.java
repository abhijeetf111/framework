package MethodOverloading;

public class SequenceOfArguments {

	void show(String name,int a) {
		System.out.println("1");
	}
	
	void show(int a,String name) {
		System.out.println("2");
	}
	public static void main(String[] args) {
		SequenceOfArguments obj=new SequenceOfArguments();
		obj.show(10, "abhi");
		obj.show("abc", 20);
	}

}
