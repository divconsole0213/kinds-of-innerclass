package nestedInterface;

interface  Showable{
	void show();
	interface Message{
		void msg();
	}
}
public class NestedInterface implements Showable.Message {

	
	@Override
	public void msg() {
		System.out.println("지금 보고 계신건 내부 인터페이스 내 인터페이스의 메서드"
				+"입니다.");
	}
	public static void main(String[] args) {

		Showable.Message message = new NestedInterface();
		message.msg();
	}


}
