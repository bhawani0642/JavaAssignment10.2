/*
 * Created another package named package2
 */
package package2;

/*
 * Created class named as B
 */
public class B {

	// main method
	public static void main(String[] args) {
		// Here we have imported using using fully qualified name
		package1.A pc = new package1.A();
		// calling the method of Class A
		pc.print();

	}

}
