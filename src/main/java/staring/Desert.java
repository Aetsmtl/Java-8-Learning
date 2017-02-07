package staring;

public class Desert {

	private String myName;
	
	public String getMyName() {
		return myName;
	}
	
	public void setMyName(String myName) {
		this.myName = myName;
	}

	// default constructor
	public Desert() {
		// TODO Auto-generated constructor stub
	}
	
	public Desert(String name){
		setMyName(name);
	}
	
	public String talkAboutMe(){
		
		String speech = "Hello, I am a kind of dessert"; 
		
		return speech;
	}	
}
