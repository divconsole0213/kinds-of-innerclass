package staticInner;

public class StaticInner {
 static String serialNum = "000001";
	static class Inner{
		void msg() {
			System.out.println("공통된 serial Number는\t" + serialNum);
		}
	}
	public static void main(String[] args) {
		StaticInner.Inner inner = new StaticInner.Inner();
		inner.msg();

	}

}
