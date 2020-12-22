package Study_1201;


import Study_1201.org.opentutorials.iot.Elevator;
import Study_1201.org.opentutorials.iot.Lighting;
import Study_1201.org.opentutorials.iot.Security;



public class OkJavaGoInHome {

	public static void main(String[] args) {
		
		String id ="JAVA APT 507";
		
		//Elevator call
		
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		//security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		//Light on
		Lighting hallLamp = new Lighting(id+"/Hall Lamp");
		hallLamp.on();
		
		
		
		
	

	}

}
