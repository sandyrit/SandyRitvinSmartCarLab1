package selfdrivingcar;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

public class Car implements SelfCheckCapable {
	private String brand;
	private String color;
	private String lights;
	private String powerNoise;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Car mycar = new Car ();
	GPS_Module myGPS_Module = new GPS_Module();
	Drive_Module myDrive_Module = new Drive_Module();
	Camera_Module myCameraModule = new Camera_Module();
	Command_Center myCommand_Center = new Command_Center();
	Ultrasonic_Module myUltrasonic_Module = new Ultrasonic_Module();
	Display myDisplay = new Display();
	}
	private void lightsOn() {}
	private void lightsOff() {}
	private void carOn() {}
	private void carOff() {} 
	private void powerNoise() {}
	private void connectToCommandCenter() {}
	private void selfcheck() {}
	private void verifyUpdateCommited() {}
	private void confirmSuccessful() {}


	public Car () {runSelfCheck();}
	
	


@Override
public boolean selfCheck() {
	// TODO Auto-generated method stub
	return SelfCheckUtils.randomCheck(0.1);
}

@Override
public String getComponentName() {
	// TODO Auto-generated method stub
	return "Car";
}

@Override
public boolean runSelfCheck() {
	// TODO Auto-generated method stub
	return SelfCheckUtils.basicSelfCheckRunner(this);
}}
