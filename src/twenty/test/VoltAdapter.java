package twenty.test;


public class VoltAdapter implements FiveVolt {
	Volt220 mVolt220;

	public VoltAdapter(Volt220 adapter) {
		super();
		this.mVolt220 = adapter;
	}

	public int getmVolt220() {
		return mVolt220.getVolt220();
	}

	@Override
	public int getVolt5() {
		return 5;
	}

}
