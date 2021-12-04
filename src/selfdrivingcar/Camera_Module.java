package selfdrivingcar;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

public class Camera_Module extends Sensors implements SelfCheckCapable{

	public void turnOn() {
		// TODO Auto-generated method stub

	}
	private void lineTracking() {}
	private void lightTracing() {}
	private void faceTracing() {}
	
	public Camera_Module () {runSelfCheck();}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Camera_Module";
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}}
