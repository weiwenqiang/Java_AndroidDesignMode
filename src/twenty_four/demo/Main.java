package twenty_four.demo;

public class Main {
	public static void main(String[] args) {
		// 原味
		Ordinary implOrdinary = new Ordinary();

		// 准备糖类
		Sugar implSugar = new Sugar();

		// 大杯咖啡 原味
		LargeCoffee largeCoffeeOrdinary = new LargeCoffee(implOrdinary);
		largeCoffeeOrdinary.makeCoffee();

		// 小杯咖啡 原味
		SmallCoffee smallCoffeeOrdinary = new SmallCoffee(implOrdinary);
		smallCoffeeOrdinary.makeCoffee();

		// 大杯咖啡 加糖
		LargeCoffee largeCoffeeOrdinarySugar = new LargeCoffee(implSugar);
		largeCoffeeOrdinarySugar.makeCoffee();

		// 小杯咖啡 加糖
		SmallCoffee smallCoffeeOrdinarySugar = new SmallCoffee(implSugar);
		smallCoffeeOrdinarySugar.makeCoffee();

	}
}
