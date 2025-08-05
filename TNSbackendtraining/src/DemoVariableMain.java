
public class DemoVariableMain {
	public static void main(String[] args) {
		DemoVariable obj = new DemoVariable();
		System.out.println(obj.instanceVar);
		System.out.println(DemoVariable.staticVar);
		obj.display();

	}

}
