package MethodOverloading;

public class AutomaticPromotionCase4 {

	void show(int a,float b) {
		System.out.println("int float method");
	}
	void show(float a,int b) {
		System.out.println("float int method");
	}
	public static void main(String[] args) {
		AutomaticPromotionCase4 obj =new AutomaticPromotionCase4();
		obj.show(10, 20.5f);
		obj.show(20.5f, 20);
	//	obj.show(10,20);
		
		/*	When no of arguments are more than it cannot be promoted
		 * 
		 */
	}

}
