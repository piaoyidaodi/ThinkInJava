package typeinfo;


class Candy{
	static {System.out.println("Loading Candy");}
}

class Gum{
	static {System.out.println("Loading Gum");}
}

class Cookie{
	static {System.out.println("Loading Cookie");}
}

public class SweetShop {

	public static void main(String[] args) {
		System.out.println("inside main");
		new Candy();
		System.out.println("After creating Candy");
		// Class.forName()需要类的完全路径名
		try {
			Class.forName("Gum");
			// Class.forName("typeinfo.Gum");
		} catch (ClassNotFoundException e) {
			System.out.println("Can't find Gum");
		}
		
		System.out.println("After Class.forName(\"Gum\")");
		new Cookie();
		System.out.println("After creating Cookies");
	}
}
