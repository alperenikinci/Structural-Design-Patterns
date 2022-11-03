package adapter;

public class AdapterPatternTest {

	public static void main(String[] args) {
		
		testClassAdapter();
		testObjectAdapter();
	}

	private static void testObjectAdapter() {
		SocketAdapter sockAdapter = new SocketObjectAdapterImpl();
		Volt v5 = getVolt(sockAdapter,3);
		Volt v24 = getVolt(sockAdapter,12);
		Volt v240 = getVolt(sockAdapter,120);
		System.out.println("v5 volts using Object Adapter="+v5.getVolts());
		System.out.println("v24 volts using Object Adapter="+v24.getVolts());
		System.out.println("v240 volts using Object Adapter="+v240.getVolts());
	}

	private static void testClassAdapter() {
		SocketAdapter sockAdapter = new SocketClassAdapterImpl();
		Volt v5 = getVolt(sockAdapter,3);
		Volt v24 = getVolt(sockAdapter,12);
		Volt v240 = getVolt(sockAdapter,120);
		System.out.println("v5 volts using Class Adapter="+v5.getVolts());
		System.out.println("v24 volts using Class Adapter="+v24.getVolts());
		System.out.println("v240 volts using Class Adapter="+v240.getVolts());
	}
	
	private static Volt getVolt(SocketAdapter sockAdapter, int i) {
		switch (i){
		case 3: return sockAdapter.get5Volt();
		case 12: return sockAdapter.get24Volt();
		case 120: return sockAdapter.get24Volt();
		default: return sockAdapter.get24Volt();
		}
	}
}