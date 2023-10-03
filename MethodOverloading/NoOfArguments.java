package MethodOverloading;

public class NoOfArguments {

	void show() {
		System.out.println("1");
	}
	
	void show(int a) {
		System.out.println("2");
	}
	public static void main(String[] args) {
		NoOfArguments obj=new NoOfArguments();
		obj.show();
		obj.show(10);
	}

}
