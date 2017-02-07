package staring;

public class Meat {

	private String myName;
	
	public String getMyName() {
		return myName;
	}
	
	public void setMyName(String myName) {
		this.myName = myName;
	}

	// default constructor
	public Meat() {
		// TODO Auto-generated constructor stub
	}
	
	public Meat(String name){
		setMyName(name);
	}
	
	public String talkAboutMe(){
		
		String speech = "Hello, I am a Meat "; 

		return speech;
	}	
}
