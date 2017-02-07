package staring;

public class Vegetable {

	String myName;
	
	public String getMyName() {
		return myName;
	}
	
	public void setMyName(String myName) {
		this.myName = myName;
	}
	
	public String talkAboutMe(){
		
		String speech = "Hello, I am an Vegetable "; 
		
		if (myName != null && !myName.isEmpty())
			speech = speech + "My name is " + getMyName();
		
		return speech;
	}
	
}
