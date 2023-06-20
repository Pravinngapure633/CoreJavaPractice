package variable;

public class A {

	 private String name;

	  // constructor
	  A() {
	    System.out.println("Constructor Called:");
	    name = "Programiz";
	  }

	  public static void main(String[] args) {

	    // constructor is invoked while
	    // creating an object of the Main class
	    A obj = new A();
	    System.out.println("The name is " + obj.name);
	  }
}
