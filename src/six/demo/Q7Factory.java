package six.demo;

public class Q7Factory extends CarFactory {

	@Override
	public ITire createTire() {
		// TODO Auto-generated method stub
		return new SUVTire();
	}

	@Override
	public IEngine createEngine() {
		// TODO Auto-generated method stub
		return new ImportEngine();
	}

	@Override
	public IBrake createBrake() {
		// TODO Auto-generated method stub
		return new SeniorBrake();
	}

}
