package MethodOverloading;

public class AutomaticPromotionCase1 {

	void show(int a) {
		System.out.println("int method");
	}
	void show(String a) {
		System.out.println("string method");
	}
	public static void main(String[] args) {
		AutomaticPromotionCase1 obj =new AutomaticPromotionCase1();
		obj.show('x');

	}

}
