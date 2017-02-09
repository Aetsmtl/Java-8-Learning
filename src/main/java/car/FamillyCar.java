package car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class FamillyCar {
	
	@Autowired
	@Qualifier(value="sTire")
	private Tire frontRightTire;
	
	@Autowired
	@Qualifier(value="sTire")
	private Tire frontLeftTire;
	
	@Autowired
	@Qualifier(value="bTire")
	private Tire backLeftTire;
	
	@Autowired
	@Qualifier(value="bTire")
	private Tire backRightTire;
	
	@Autowired
	@Qualifier(value="sCyl")
	private Engine smallEngineCar;
	
	
	public String witchTypeOfCar(){
		String speechMeal = " This car contains : " + "\n";
		
		if (frontRightTire != null ) speechMeal += " frontRightTire = " + frontRightTire.getTireDiameter() + "\n";
		if (frontLeftTire != null ) speechMeal += " frontLeftTire " + frontLeftTire.getTireDiameter() + "\n";
		if (backLeftTire != null ) speechMeal += " backLeftTire " + backLeftTire.getTireDiameter() + "\n";
		if (backRightTire != null ) speechMeal += " backRightTire " + backRightTire.getTireDiameter() + "\n";
		if (smallEngineCar != null ) speechMeal += " smallEngineCar " + smallEngineCar.getEngineType() + "\n";
		
		return speechMeal;
	}
	

}
