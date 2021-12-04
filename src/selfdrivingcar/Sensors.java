package selfdrivingcar;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

public abstract class Sensors implements SelfCheckCapable {
	public boolean sensorIsOn;
	private String sensorType;
	public abstract void turnOn();



@Override
public boolean selfCheck() {
	// TODO Auto-generated method stub
	return SelfCheckUtils.randomCheck(0.1);
}

@Override
public String getComponentName() {
	// TODO Auto-generated method stub
	return "Sensors";
}

@Override
public boolean runSelfCheck() {
	// TODO Auto-generated method stub
	return SelfCheckUtils.basicSelfCheckRunner(this);
}}	