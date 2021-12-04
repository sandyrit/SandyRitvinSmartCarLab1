package selfdrivingcar;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

public class GPS_Module  extends Sensors implements SelfCheckCapable {
	private float coordinateX;
	private float coordinateY;
	
	private float gpsLocator() {return 0;}
	private void calibrateCompass() {}

	public GPS_Module () {runSelfCheck();}
	
	
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "GPS_Module";
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}}
