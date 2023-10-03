package MethodOverloading;

public class MainMethodOverloading {

	public static void main(String[] args) {
		System.out.println("1");
		MainMethodOverloading obj =new MainMethodOverloading();
		obj.main(20);
	}
	
	public static void main(int a) {
		System.out.println("2");
	}

}
