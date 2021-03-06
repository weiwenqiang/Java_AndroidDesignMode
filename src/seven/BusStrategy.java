package seven;

public class BusStrategy implements CalculateStrategy {

	@Override
	public int calculatePrice(int km) {
		// 超过10公里的总距离
		int extraTotal = km - 10;
		// 超过的距离是5公里的倍数
		int extraFactor = extraTotal / 5;
		// 超过的距离对5公里取余
		int fraction = extraTotal % 5;
		// 计算价格
		int price = 1 + extraFactor * 1;
		return fraction > 0 ? ++price : price;
	}

}
