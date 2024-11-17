package co.edu.poli.adapter.model;

public class SocketObjectAdapterImpl implements SocketAdapter {

	// Using Composition for adapter pattern
	private Socket sock;

	public SocketObjectAdapterImpl() {
		sock = new Socket();
	}

	@Override
	public Volt get220Volt() {
		return sock.getVolt();
	}

	@Override
	public Volt get120Volt() {
		Volt v = sock.getVolt();
		return convertVolt(v, 1.83);
	}

	@Override
	public Volt get12Volt() {
		Volt v = sock.getVolt();
		return convertVolt(v, 18.3);
	}

	@Override
	public Volt get3Volt() {
		Volt v = sock.getVolt();
		return convertVolt(v, 73.3);
	}

	private Volt convertVolt(Volt v, double i) {
		return new Volt(v.getVolts() / i);
	}

}