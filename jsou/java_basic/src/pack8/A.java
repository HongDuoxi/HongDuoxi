package pack8;

public class A {

	int field_1; // 바깥쪽 클래스 멤버

	public A() {
		System.out.println("A 객체 생성");
	}

	void method_1() { // 바깥쪽 클래스 멤버 method
		System.out.println("method_1 수행, " + field_1);
	}

	class B { // 인스턴스 멤버 클래스

		int field_2;

		public B() {
			System.out.println("B 객체 생성");
		}

		void method_2() { // 안쪽 클래스 멤버 method
			System.out.println("method_2 수행, " + field_2);
		}
	}

	static class C {

		int field_3;

		public C() {
			System.out.println("C 오브젝트 생성");
		}

		void method_3() { // 안쪽 클래스 멤버 method
			System.out.println("method_3 처리, " + field_3);
		}

	}

	void method_1_1() {
		System.out.println("method_1_1이 처리됨");

		class D {

			int field_4;

			public D() {
				System.out.println("D 인스턴스(생성자) 생성");
			}

			void method_4() { // 안쪽 클래스 멤버 method
				System.out.println("method_4 처리, " + field_4);
			}
		}

		D d = new D();
		d.field_4 = 7;
		d.method_4();
	}

	// <허용범위>

	B bb = new B();
	C cc = new C();
	// D dd = new D(); 요곤 err

	void test_1() {
		B bbb = new B();
		C ccc = new C();
	}

	static void test_2() {
		C c4 = new C();
		// B b4 = new B(); //스태틱 메소드 안이므로 일반 클래스 B는 불가능
	}

	// -----------------------------------------------------------

	public static void main(String[] args) {
		A a = new A();
		System.out.println("바깥쪽 클래스 객체 생성");
		a.field_1 = 1;
		a.method_1();

		System.out.println("\n\n----인스턴스 멤버 클래스 객체 생성----\n");

		//B b = new B(); //B는 A클래스 안에 있는 녀석. A를 통해서만! 접근 가능.

		A.B b = a.new B();
		b.field_2 = 2;
		b.method_2(); // A를 생성하지 않고는 사용 불가?

		System.out.println("\n\n----정적 멤버 클래스 객체 생성----\n");

		A.C c = new A.C();
		c.field_3 = 3;
		c.method_3();
		C cc = new C();
		cc.field_3 = 4;
		cc.method_3();

		System.out.println("\n\n----로컬 클래스 객체 생성----\n");
		a.method_1_1();

		System.out.println();
		a.test_1();
		A.test_2();
	}

}
