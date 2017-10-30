package six.demo;

public class Q3Factory extends CarFactory {

	@Override
	public ITire createTire() {
		// TODO Auto-generated method stub
		return new NormalTire();
	}

	@Override
	public IEngine createEngine() {
		// TODO Auto-generated method stub
		return new DomesticEngine();
	}

	@Override
	public IBrake createBrake() {
		// TODO Auto-generated method stub
		return new NormalBrake();
	}

}
