package classKinds;

public class Outer {

 abstract class Inner{
	 abstract void voice();
 }
	
 Inner hiddenInner = new Inner() {
	
	@Override
	void voice() {
		System.out.println("저는 익명 클래스 입니다. 프로그램 내에서 한번만 "
				+ "객체로 만들어집니다. runnable이나 event Listener 객체를 생성"
				+ "하는데 주로 사용됩니다.");
	}
};
 public static void main(String[] args) {
	
		Outer outer = new Outer();
		outer.hiddenInner.voice();

	}

}
