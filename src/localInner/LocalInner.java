package localInner;

public class LocalInner {

	void display() {
		String data = "매서드안에서 삽니다.";
		class Description{
			void msg() {
				System.out.println("저는 Local Inner Class이고요\t" + data);
				}
			}
		Description description = new Description();
		description.msg();
		}
	public static void main(String[] args) {
		LocalInner localInner = new LocalInner();
		localInner.display();
	}

}
