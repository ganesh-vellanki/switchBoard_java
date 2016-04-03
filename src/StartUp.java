import java.util.ArrayList;

public class StartUp {
	
	public static ArrayList<Iswitch> Switches;
	
	public static ArrayList<Idevice> Devices;
	
	public static int _devicesCount = 0;
	
	public static void main(String [] args){
		System.out.println("**welcome to Switch Board Simulation**");
		System.out.println("Enter number of devices");
		
		while(_devicesCount > 0) {
			try {
				Integer.parseInt( System.console().readLine());
			}
			catch(NumberFormatException e){
				_devicesCount = 0;
				System.out.println("Not a valid number, please enter a valid number");
			}
		}
		
		for(short i = 0;  i< _devicesCount; i++) {
			Iswitch switch1 = new Switch();
			Idevice device1 = new Device();
			
			switch1.SetDevice(device1);
			
			Devices.add(device1);
			Switches.add(switch1);
			
			System.out.println(String.format("Created device and switch of id %d and linked", i));
		}
		
	}
}
