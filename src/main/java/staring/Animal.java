package staring;

import java.util.List;
import java.util.Map;

public class Animal {

	private String myName;
	private List<String> listOfAnimalName;
	private Map<String , String> mapOfAnimalName;
	
	public String getMyName() {
		return myName;
	}
	
	public void setMyName(String myName) {
		this.myName = myName;
	}
	
	public List<String> getListOfAnimalName() {
		return listOfAnimalName;
	}

	public void setListOfAnimalName(List<String> listOfAnimalName) {
		this.listOfAnimalName = listOfAnimalName;
	}

	public Map<String, String> getMapOfAnimalName() {
		return mapOfAnimalName;
	}

	public void setMapOfAnimalName(Map<String, String> mapOfAnimalName) {
		this.mapOfAnimalName = mapOfAnimalName;
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
			speech = speech + "\nMy name is " + getMyName();
		
		if (listOfAnimalName != null && !listOfAnimalName.isEmpty()){
			speech = speech + "\nThe List animal is : ";
			for (String s : listOfAnimalName){
				speech += " "+s+" ";
			}
		}
		
		if (mapOfAnimalName != null && !mapOfAnimalName.isEmpty()){
			speech = speech + "\nThe Map animal is : ";
		    for (Map.Entry<String, String> s : mapOfAnimalName.entrySet()){
			    speech += " key : "+s.getKey()+"  ==> Value : "+s.getValue();
		    }
		}
		
		return speech;
	}	
}
