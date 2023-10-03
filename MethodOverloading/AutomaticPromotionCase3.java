package MethodOverloading;

public class AutomaticPromotionCase3 {

	void show(StringBuffer a) {
		System.out.println("StringBuffer method");
	}
	void show(String a) {
		System.out.println("string method");
	}
	public static void main(String[] args) {
		AutomaticPromotionCase3 obj =new AutomaticPromotionCase3();
		obj.show("abc");
		obj.show(new StringBuffer("xyz"));
	//	obj.show(null);
		/*	While resolving Overloaded Methods, Compiler will always give precedence
		 * 	for the child type argument than compared with parent type argument.
		 */
	}

}
