package selfdrivingcar;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

public class Drive_Module implements SelfCheckCapable{
	private float direction;
	private int speed;
	
	private void turnRight() {}
	private void turnLeft() {}
	private void accelerate() {}
	private void reverse() {} 

	public Drive_Module () {runSelfCheck();}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Drive_Module";
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}}
