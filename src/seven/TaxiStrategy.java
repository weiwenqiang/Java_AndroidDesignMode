package seven;

public class TaxiStrategy implements CalculateStrategy {

	@Override
	public int calculatePrice(int km) {
		// TODO Auto-generated method stub
		return km*2;
	}

}
