package MethodOverloading;

public class AutomaticPromotionCase2 {

	void show(Object a) {
		System.out.println("Object method");
	}
	void show(String a) {
		System.out.println("string method");
	}
	public static void main(String[] args) {
		AutomaticPromotionCase2 obj =new AutomaticPromotionCase2();
		obj.show("abc");

		/*	While resolving Overloaded Methods, Compiler will always give precedence
		 * 	for the child type argument than compared with parent type argument.
		 */
	}

}
