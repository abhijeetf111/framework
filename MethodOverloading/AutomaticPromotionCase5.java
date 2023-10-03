package MethodOverloading;

public class AutomaticPromotionCase5 {

	void show(int a) {
		System.out.println("int method");
	}
	void show(int... a) {
		System.out.println("varargs method");
	}
	public static void main(String[] args) {
		AutomaticPromotionCase5 obj =new AutomaticPromotionCase5();
		obj.show(10,20,30,40);
		obj.show();
	}
	/*	Varargs:-
	 * 	The varargs allows the method to accept zero or multiple arguments.
	 * 	Before varargs either we use overloaded method or take an array as the method 
	 *	 parameter but it was not considered good because it leads to the maintenance problem.
	 * 	if we dont know how many arguments we will have to pass in the method,
	 * 	varargs is the better approach.  
	 * 
	 * 	In general varargs get least priority i.e. if no other method matched,
	 * 	then only vararg method will get the chance,because int came in 1.0 version
	 * 	and varargs came in 1.5 version.
	 */

}
