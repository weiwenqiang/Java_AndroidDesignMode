package seven;

public class TranficCalculator {
	public static void main(String[] args) {
		TranficCalculator calculator = new TranficCalculator();
		//���ü������
		calculator.setStrategy(new TaxiStrategy());
		//����۸�
		System.out.println("��������16����ļ۸� �� " + calculator.calculatePrice(16));
	}
	CalculateStrategy mStrategy;
	public void setStrategy(CalculateStrategy mStrategy){
		this.mStrategy = mStrategy;
	}
	
	public int calculatePrice(int km){
		return mStrategy.calculatePrice(km);
	}
}
