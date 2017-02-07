package staring;

public class Fruit {

	private String myName;
	
	public String getMyName() {
		return myName;
	}
	
	public void setMyName(String myName) {
		this.myName = myName;
	}

	// default constructor
	public Fruit() {
		// TODO Auto-generated constructor stub
	}
	
	public Fruit(String name){
		setMyName(name);
	}
	
	public String talkAboutMe(){
		
		String speech = "Hello, I am a Fruit "; 
		return speech;
	}	
}
