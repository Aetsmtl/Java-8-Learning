package staring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FoodApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Vegetable v = new Vegetable();
		//Animal a = new Animal();
		
		//ApplicationContext appContext = new FileSystemXmlApplicationContext("AppContext.xml");
		ApplicationContext appContext = new ClassPathXmlApplicationContext("appContextPackage/AppContext.xml");
		
		Vegetable v = appContext.getBean("vegetable", Vegetable.class);
		//use property in XML file 
		Vegetable myVegetable = appContext.getBean("vegWithName", Vegetable.class);
		Animal a = (Animal) appContext.getBean("animal");
		//use constructor-args in XML file
		Animal myChicken = appContext.getBean("animalWithName", Animal.class);
		
		
		
		System.out.println(v.talkAboutMe());
		System.out.println(a.talkAboutMe());
		System.out.println(myChicken.talkAboutMe());
		System.out.println(myVegetable.talkAboutMe());
		
		//((FileSystemXmlApplicationContext)appContext).close();
	}

}
