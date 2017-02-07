package staring;

public class Animal {

	private String myName;
	
	public String getMyName() {
		return myName;
	}
	
	public void setMyName(String myName) {
		this.myName = myName;
	}
	
	// default constructor
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	public Animal(String name){
		setMyName(name);
	}
	
	public String talkAboutMe(){
		
		String speech = "Hello, I am an animal "; 
		
		//return (myName.equals("") || myName == null) ? speetch : speetch + "My name is " + getMyName();
		if (myName != null && !myName.isEmpty())
			speech = speech + "My name is " + getMyName();
		
		return speech;
	}	
}
