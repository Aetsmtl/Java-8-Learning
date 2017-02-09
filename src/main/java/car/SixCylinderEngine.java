package car;

import org.springframework.stereotype.Component;

@Component()
public class SixCylinderEngine implements Engine {

	@Override
	public String drive() {
		// TODO Auto-generated method stub
		return "I am driving with 6 cylinder engine ";
	}

	@Override
	public String getEngineCylinderNumber() {
		// TODO Auto-generated method stub
		return "6";
	}

}
