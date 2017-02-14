package testPackage;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.aetsmtl.model.FoodGroup;
import com.aetsmtl.model.FoodGroupDAO;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext appContext = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/config/myDemoApp-servletConfig.xml");
		
		FoodGroupDAO fgDAO = appContext.getBean("foodGroupDAO", FoodGroupDAO.class);
		
		List<FoodGroup> myListOfFoodGroup = fgDAO.getFoodGroups();
		
		System.out.println(myListOfFoodGroup.stream().count());
		
		for (FoodGroup fg : myListOfFoodGroup){
			System.out.println(fg.talkAboutMe());
		}
	}

}
