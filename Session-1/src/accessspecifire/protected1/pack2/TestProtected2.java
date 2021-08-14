package accessspecifire.protected1.pack2;

import accessspecifire.protected1.pack1.ProtectedDemo;

public class TestProtected2 {

	//protected is not accessible in another package
		public static void main(String[] args) {
			ProtectedDemo demo=new ProtectedDemo();
			//System.out.println(demo.num1);
		}
}
