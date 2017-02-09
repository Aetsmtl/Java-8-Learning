package car;

import org.springframework.stereotype.Component;

@Component(value="fourCyl")
public class FourCylinderEngine implements Engine {

	@Override
	public String getEngineCylinderNumber() {
		// TODO Auto-generated method stub
		return "I am driving with 4 cylinder engine ";
	}

	@Override
	public String drive() {
		// TODO Auto-generated method stub
		return "4";
	}

}
