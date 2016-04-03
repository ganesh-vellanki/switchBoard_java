
public class Switch implements Iswitch {

	private Idevice _attachedDevice;
	
	public Switch(){
		this._attachedDevice = null;
	}
	
	public Boolean TurnOff() {
		if(!this.IsEmpty()){
			return this._attachedDevice.TurnOff();
		}
		return false;
	}

	public Boolean TurnOn() {
		if(!this.IsEmpty()){
			return this._attachedDevice.TurnOn();
		}
		return false;
	}

	public void SetDevice(Idevice _device) {
		this._attachedDevice = _device;
	}

	public void ClearSwitch() {
		if(!this.IsEmpty()) {
			this._attachedDevice = null;			
		}
	}

	public Idevice GetDevice() {
		return this._attachedDevice;
	}

	public Boolean IsEmpty() {
		if(this._attachedDevice != null){
			return true;
		}
		return false;
	}
	
}
