
public class Device implements Idevice {

	private DeviceStatus _deviceStatus;
	
	public Device (){
		this._deviceStatus = DeviceStatus.OFF;
	}
	
	public Device(DeviceStatus _deviceStatus) {
		this._deviceStatus = _deviceStatus;
	}
	
	public Boolean TurnOn() {
		if(this._deviceStatus == DeviceStatus.OFF){
			this._deviceStatus = DeviceStatus.ON;
			return true;
		}
		
		if(this._deviceStatus == DeviceStatus.ON){
			return true;
		}
		
		return false; 
	}

	public Boolean TurnOff() {
		
		if(this._deviceStatus == DeviceStatus.ON) {
			this._deviceStatus = DeviceStatus.OFF;
			return true;
		}
		
		if(this._deviceStatus == DeviceStatus.OFF) {
			return true;
		}
		
		return false;
	}

	public DeviceStatus GetDeviceStatus() {
		return this._deviceStatus;
	}
	
}
