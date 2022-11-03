package adapter;

public class SocketObjectAdapterImpl implements SocketAdapter{

	private Socket sock = new Socket();
	
	@Override
	public Volt get240Volt() {
		return sock.getVolt();
	}

	@Override
	public Volt get24Volt() {
		Volt v= sock.getVolt();
		return convertVolt(v,10);
	}

	@Override
	public Volt get5Volt() {
		Volt v= sock.getVolt();
		return convertVolt(v,40);
	}
	
	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);
	}
}