package co.edu.poli.adapter.model;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

	@Override
	public Volt get220Volt() {
		return getVolt();
	}

	@Override
	public Volt get120Volt() {
		Volt v = getVolt();
		return convertVolt(v, 1.83);
	}
	
	@Override
	public Volt get12Volt() {
		Volt v = getVolt();
		return convertVolt(v, 18.3);
	}

	@Override
	public Volt get3Volt() {
		Volt v = getVolt();
		return convertVolt(v, 73.3);
	}

	private Volt convertVolt(Volt v, double d) {
		return new Volt(v.getVolts() / d);
	}

}
