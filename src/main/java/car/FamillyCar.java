package car;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Component;

import annot.RandomDemoAnnotation;

//@Component(value="famCar")
@RandomDemoAnnotation
public class FamillyCar {

	
	//@Autowired
	//@Qualifier(value="sTire")
	private Tire frontRightTire;
	
	//@Autowired
	//@Qualifier(value="sTire")
	private Tire frontLeftTire;
	
	//@Autowired
	//@Qualifier(value="bTire")
	private Tire backLeftTire;
	
	//@Autowired
	//@Qualifier(value="bTire")
	private Tire backRightTire;
	
	@Autowired
	@Qualifier(value="sixCyl")
	private Engine smallEngineCar;
	
	
	public String witchTypeOfCar(){
		String speechMeal = " This car contains : " + "\n";
		
		if (frontRightTire != null ) speechMeal += " frontRightTire = " + frontRightTire.getTireDiameter() + "\n";
		if (frontLeftTire != null ) speechMeal += " frontLeftTire " + frontLeftTire.getTireDiameter() + "\n";
		if (backLeftTire != null ) speechMeal += " backLeftTire " + backLeftTire.getTireDiameter() + "\n";
		if (backRightTire != null ) speechMeal += " backRightTire " + backRightTire.getTireDiameter() + "\n";
		if (smallEngineCar != null ) speechMeal += " smallEngineCar " + smallEngineCar.getEngineCylinderNumber() + smallEngineCar.drive() +"\n";
		
		return speechMeal;
	}
	

}
