package selfdrivingcar;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

public class Command_Center implements SelfCheckCapable {

	private String communicationMethod;
	
	private void receiveCommunication() {}
	private void sendCommunication() {}
	private void executeCode() {}
	private void checkSystem() {}
	private void restartCar() {}
	private void checkIfMostRecentSoftware() {}
	private void initiateUpdate() {}

	public Command_Center () {runSelfCheck();}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Command_Center";
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}}
