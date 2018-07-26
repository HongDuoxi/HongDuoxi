package pack8;

public class SaramJames {
	
	public Saram getSaram() {
		//return new Saram();
		
		return new Saram() 
		{
			public String getIrum() { //내부 익명 클래스(하나의 약속으로 받아들이렴)
				return "제임스";
				/*aa();*/
			}
			/*public void aa() {
				
			}*/
		};
		
		
	}

}
