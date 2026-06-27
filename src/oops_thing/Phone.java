package oops_thing;

class SmartPhone {
	String name;
	int model;
	static String category;
	
	void showData() {
		System.out.println(name+"-"+model+"-"+category);
	}
}

public class Phone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sp = new SmartPhone();
		SmartPhone sp2 = new SmartPhone();
		
		sp.name = "Oneplus";
		sp.model = 15;
		SmartPhone.category = "smartphone";
		
		sp2.name = "Oneplus";
		sp2.model = 13;
		SmartPhone.category = "smartphone";
		
		SmartPhone.category = "Phone";
		
		sp.showData();
		sp2.showData();
	}

}

//Static Keyword program, the static variable belongs to the class and it will remain same for all the objects of the class. 