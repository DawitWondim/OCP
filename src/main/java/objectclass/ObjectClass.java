import java.util.*;

public class ObjectClass {

	public static void main(String [] args) {

	// instanceof keyword

	//Every object is an instance of Object class EXCEPT null
	
	String name = "Kobe";
	String myNullVariable = null;
	List<Integer> myList = new ArrayList<>(); 
	System.out.print("String instanceof Object: ");
	System.out.print(name instanceof Object);
	System.out.println();
	System.out.print("ArrayList instanceof Object: ");  
	System.out.print(myList instanceof Object); 
	System.out.println();
	System.out.print("null instanceof Object: ");  
	System.out.print(myNullVariable instanceof Object);
	System.out.println();
	}
}
