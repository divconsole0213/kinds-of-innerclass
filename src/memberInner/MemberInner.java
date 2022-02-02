package memberInner;

public class MemberInner {

	class Inner{
		private int serialNum = 0001; 
		public void num(int workerNum){
			if(workerNum != 0)
			System.out.println(serialNum*workerNum);
		}
	}
	public static void main(String[] args) {
		MemberInner outer = new MemberInner();
		MemberInner.Inner inner = outer.new Inner();
		inner.num(2);
	}

}
