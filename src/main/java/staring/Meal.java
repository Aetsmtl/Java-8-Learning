package staring;

public class Meal {

	private String myName;
	private Fruit fruit;
	private Desert desert;
	private Meat meat;
	private Vegetable vege; // I have to put "vegetable" to autowire  by name
	private Animal animal;
	
	public String getMyName() {
		return myName;
	}
	
	public void setMyName(String myName) {
		this.myName = myName;
	}

	public Fruit getFruit() {
		return fruit;
	}

	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}

	public Desert getDesert() {
		return desert;
	}

	public void setDesert(Desert desert) {
		this.desert = desert;
	}

	public Meat getMeat() {
		return meat;
	}

	public void setMeat(Meat meat) {
		this.meat = meat;
	}

	public Vegetable getVege() {
		return vege;
	}

	public void setVege(Vegetable vege) {
		this.vege = vege;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	// default constructor
	public Meal() {
		// TODO Auto-generated constructor stub
	}
	
	public Meal(String name){
		setMyName(name);
	}
	
	public String talkAboutMe(){
		
		String speech = "Hello, I am an Meat "; 

		return speech;
	}
	
	public String wathsInThisMeal(){
		String speechMeal = "This meal contains : ";
		
		if (fruit != null ) speechMeal += " Some fruits ";
		if (meat != null ) speechMeal += " Some meat ";
		if (desert != null ) speechMeal += " Some desert ";
		if (vege != null ) speechMeal += " Some vegetable ";
		if (animal != null ) speechMeal += " Some animal ";
		
		return speechMeal;
	}
}
