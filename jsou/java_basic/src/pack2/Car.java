package pack2; //성격이 비슷한 클래스들을 모아두는 폴더

//모든건 클래스 안에 있어야 된다.
//html이 바디에 모든 것을 담아야 하는 것 처럼!

//클래스 선언 - 두 개의 멤버를 가질 수 있다
public class Car { //[접근지정자][기타제한자] Class 클래스명
			    	//접근지정자: public, private, protected, 생략
	
	//멤버필드[멤버변수, 전역변수]
	int wheel; 			//[접근지정자][기타제한자] type 멤버명
	private int airBag = 1;
	private int speed; 	//캡슐화: private는 클래스 안에서만 쓸 수 있음
	public String name;
	
	public Car() {
		//***생성자***(중요!)
		//객체 생성 시 초기화 작업을 함!! 초기값을 요기서도 줄 수 있음
		//객체 생성 시 가장 먼저 시스템에 의해 호출
		//인위적으로 호출 불가
		//생성자를 반드시 호출하시만 그 안에 초기값, 초기화 작업 필요없으면 안써도 됨.
		System.out.println("Car 클래스 생성자");
		wheel = 4;
	}
	
	//멤버메소드
	//[접근지정자][기타제한자] 반환형 메소드명 소문자로(인수,...){}
	//카멜표기법, 중간중간 대문자로 써주기 abcGoodNice
	//나열형, 언더바를 사용하기 abc_good_nice
	public void abc() {
		System.out.println("abc 메소드(method) 수행");
		System.out.println("에어백 수: " + airBag); //private멤버 호출 가능
		System.out.println("바퀴 수: " + wheel); //접근지정자가 default (생략: friendly)
		def(); //자신이 속해 있는 클래스 내에서는 메소드 호출가능
		int result = korea(7);
		System.out.println("스피커 볼륨은 " + result);
		System.out.println("속도는 " + speed);
		int year = 2018; //메소드 내에서 선언한 변수는 지역변수. 지역변수는 반드시 초기값 필수!
						//지역변수에는 private 사용하면 안 됨.
		System.out.println("생산년도는 " + year);
	}
	
	private void def() {
		System.out.println("def 메소드 처리");
	}
	
	int korea(int speaker_vol) {
		int dongdong = speaker_vol + 10;
		return dongdong; //0.0은 type miss match. 캐스팅해서 넘기면 돼 return (int)0.0;~~
		//return (int)0.0, 10; return으로 두개 넘길 수 없음. 하나만 가능.
	}
	
	
	//private 값을 변화시키기 위해서는 public이 필요하다.
	//***private 멤버에 대한 외부접근 가능 메소드****중요!
	
	public int getSpeed() {  //getter
		return speed;
	}
	
	public void setSpeed(int password,int speed) { //setter
		if(password == 1234) {
			this.speed = speed;
		}else {
			System.out.println("비밀번호 불일치");
		}
		
	}
	
/*	
	public void setSpeed(int a) { //speed의 값을 지정하는 기술 
		//setter
		//speed = s; //멤버변수
		//speed = speed; //지역변수
		this.speed = speed; //지역변수와 멤버필드의 이름이 같을 때 this라는 키워드를 건다.
	}
*/	


}
