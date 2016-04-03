
public interface Iswitch {
	public Boolean TurnOff();
	public Boolean TurnOn();
	public void SetDevice(Idevice _device);
	public void ClearSwitch();
	public Idevice GetDevice();
	public Boolean IsEmpty();
}
