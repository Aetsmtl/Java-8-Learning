package staring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FoodApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Vegetable v = new Vegetable();
		//Animal a = new Animal();
		
		//ApplicationContext appContext = new FileSystemXmlApplicationContext("AppContext.xml");
		ApplicationContext appContext = new ClassPathXmlApplicationContext("appContextPackage/appContext.xml");
		
		Vegetable v = appContext.getBean("vegetable", Vegetable.class);
		Animal a = (Animal) appContext.getBean("animal");
		System.out.println(v.talkAboutMe());
		System.out.println(a.talkAboutMe());
		
		//use constructor-args in XML file
		Animal myChicken = appContext.getBean("animalWithName", Animal.class);
		System.out.println(myChicken.talkAboutMe());
		
		//use property in XML file 
		Vegetable myVegetable = appContext.getBean("vegWithName", Vegetable.class);
		System.out.println(myVegetable.talkAboutMe());
		
		//use List and Map in XML file
		Animal myOtherAnimal = appContext.getBean("animalWithListAndMap", Animal.class);
		System.out.println(myOtherAnimal.talkAboutMe());
		
		
		Meal mWithAutoWireByName = appContext.getBean("mealWithAutowireByName", Meal.class);
		System.out.println("\n" + mWithAutoWireByName.wathsInThisMeal()); // but none none of Vegetable 
		
		Meal mealWithAutowireByTypeWithoutSpec = appContext.getBean("mealWithAutowireByTypeWithoutSpec", Meal.class);
		System.out.println("\n" + mealWithAutowireByTypeWithoutSpec.wathsInThisMeal()); // but none none of Vegetable 
		
		//Meal mWithAutoWireByDefault = appContext.getBean("mealWithAutowireByDefault", Meal.class);
		//System.out.println("\n" + mWithAutoWireByDefault.wathsInThisMeal()); // but none none of Vegetable

		Meal mealWithAnnotation = appContext.getBean("mealWithAnnotation",Meal.class );
		System.out.println("\n" + mealWithAnnotation.wathsInThisMeal()); 
		
		//((FileSystemXmlApplicationContext)appContext).close();
	}

}
