package staring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import appContextPackage.AppConfiguration;
import car.FourCylinderEngine;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
import car.SixCylinderEngine;

public class FoodApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		SixCylinderEngine sixCyl = appContext.getBean("sixCyl", SixCylinderEngine.class);
		System.out.println(sixCyl.getEngineCylinderNumber());
		FourCylinderEngine fourCyl = appContext.getBean("fourCyl", FourCylinderEngine.class);
		System.out.println(fourCyl.getEngineCylinderNumber());
		
		((AnnotationConfigApplicationContext)appContext).close();
		
	}

}
