package seven;

public class TranficCalculator {
	public static void main(String[] args) {
		TranficCalculator calculator = new TranficCalculator();
		//设置计算策略
		calculator.setStrategy(new TaxiStrategy());
		//计算价格
		System.out.println("公交车乘16公里的价格 ： " + calculator.calculatePrice(16));
	}
	CalculateStrategy mStrategy;
	public void setStrategy(CalculateStrategy mStrategy){
		this.mStrategy = mStrategy;
	}
	
	public int calculatePrice(int km){
		return mStrategy.calculatePrice(km);
	}
}
