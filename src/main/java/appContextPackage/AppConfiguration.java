package appContextPackage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import car.FamillyCar;
import car.FourCylinderEngine;
import car.SixCylinderEngine;

@Configuration
@ComponentScan("car")
public class AppConfiguration {
	
	@Bean(name="sixCyl")
	public SixCylinderEngine getSixCylinderEngine(){
		return new SixCylinderEngine();
	}
	
	@Bean(name="fourCyl")
	public FourCylinderEngine getFourCylinderEngine(){
		return new FourCylinderEngine();
	}
	
	@Bean(name="famCar")
	public FamillyCar getFamilyCar(){
		
		FamillyCar f = new FamillyCar();
		
		// f.setSmallEngineCar(getFourCylinderEngine());
		
		return f;
	}
	
}
