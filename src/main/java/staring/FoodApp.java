package staring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import appContextPackage.AppConfiguration;
import car.FamillyCar;
import car.FourCylinderEngine;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
import car.SixCylinderEngine;

public class FoodApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		SixCylinderEngine sixCyl = appContext.getBean(SixCylinderEngine.class); //One way to do
		System.out.println(sixCyl.getEngineCylinderNumber());
		// FourCylinderEngine fourCyl = appContext.getBean("fourCyl", FourCylinderEngine.class);
		FourCylinderEngine fourCyl = appContext.getBean("fourCyl",FourCylinderEngine.class); //Another way to do

		System.out.println(fourCyl.getEngineCylinderNumber());
		
		//FamillyCar familyCar = appContext.getBean("famCar", FamillyCar.class);
		// System.out.println(familyCar.witchTypeOfCar());

		((AnnotationConfigApplicationContext)appContext).close();	
	}

}
