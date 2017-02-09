package appContextPackage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import car.FourCylinderEngine;
import car.SixCylinderEngine;

@Configuration
public class AppConfiguration {
	
	@Bean(name="sixCyl")
	public SixCylinderEngine getSixCylinderEngine(){
		return new SixCylinderEngine();
	}
	
	@Bean(name="fourCyl")
	public FourCylinderEngine getFourCylinderEngine(){
		return new FourCylinderEngine();
	}
	
}
