package pack8;

public class Outer {
	private int a;
	private Inner inner;
	
	public Outer() {
		a = 10;
		inner = new Inner(); //내부 클래스를 위에서 변수로 정의해주고 포함관계로 생성
	}
	
	public void aa() {
		System.out.println("외부에 있는 aa 메소드");
		bb();
		//cc();
		inner.cc(); //*******안쪽 이너 클래스의 메소드를 불러오는 법********
	}
	
	private void bb() {
		System.out.println("외부에 있는 bb 메소드");
	}
	
	/*public*/ class Inner { //내부클래스. public을 생략해도 포함되어 있는 클래스랑 똑같이 public으로 처리 됨.
		int b;
		
		public Inner() {
			b = 20;
		}
		
		void cc() {
			System.out.println("내부에 있는 cc 메소드");
			System.out.println("a: " + a + ", b: " + b);
			bb();
		}
		
		//class Innnerrr{ 클래스 안에 클래스 안에 클래스 가능 하지만. 굳이 또 이렇게 쓰는 사람은 없어!
	}

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.aa();
		
		System.out.println();
		Outer.Inner inn = outer.new Inner();
		inn.cc(); //할 수 있으나 자주 쓰지는 않는 형태
		
		outer.inner.cc();
	}

}
