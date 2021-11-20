package selfdrivingcar;

import edu.fiu.sysdesign.SelfCheckUtils;

public class Car {
	private String brand;
	private String color;
	private String lights;
	private String powerNoise;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	car = new Car ();
	}
	private void lightsOn() {}
	private void lightsOff() {}
	private void carOn() {}
	private void carOff() {} 
	private void powerNoise() {}
}


	public Car () {}
	
	


@Override
public boolean selfCheck() {
	// TODO Auto-generated method stub
	return SelfCheckUtils.randomCheck(0.1);
}

@Override
public String getComponentName() {
	// TODO Auto-generated method stub
	return name;
}

@Override
public boolean runSelfCheck() {
	// TODO Auto-generated method stub
	return SelfCheckUtils.basicSelfCheckRunner(this);
}

