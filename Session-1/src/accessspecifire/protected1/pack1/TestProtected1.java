package accessspecifire.protected1.pack1;

public class TestProtected1 {

	//protected accessible in same package
	public static void main(String[] args) {
		ProtectedDemo demo=new ProtectedDemo();
		System.out.println(demo.num1);
	}
}
