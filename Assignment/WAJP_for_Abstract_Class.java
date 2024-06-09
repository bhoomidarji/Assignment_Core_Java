package Assignment;

abstract class Parent {
	void message()

	{
		System.out.println("message");
	}
}

class Firstsubclass extends Parent {
	void message() {
		System.out.println("This is First Sub Class");
	}
}

class Secondsubclass extends Parent {
	void message() {
		System.out.println("This is second Sub class");
	}
}

public class WAJP_for_Abstract_Class {

		public static void main(String[] args) {
			Firstsubclass a1 = new Firstsubclass();
			a1.message();

			Secondsubclass a2 = new Secondsubclass();
			a2.message();
	
		}
}
