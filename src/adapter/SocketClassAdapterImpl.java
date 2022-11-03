package adapter;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter{

	@Override
	public Volt get240Volt() {
		return getVolt();
	}

	@Override
	public Volt get24Volt() {
		Volt v= getVolt();
		return convertVolt(v,10);
	}

	@Override
	public Volt get5Volt() {
		Volt v= getVolt();
		return convertVolt(v,40);
	}
	
	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);
	}
}
