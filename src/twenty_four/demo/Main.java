package twenty_four.demo;

public class Main {
	public static void main(String[] args) {
		// ԭζ
		Ordinary implOrdinary = new Ordinary();

		// ׼������
		Sugar implSugar = new Sugar();

		// �󱭿��� ԭζ
		LargeCoffee largeCoffeeOrdinary = new LargeCoffee(implOrdinary);
		largeCoffeeOrdinary.makeCoffee();

		// С������ ԭζ
		SmallCoffee smallCoffeeOrdinary = new SmallCoffee(implOrdinary);
		smallCoffeeOrdinary.makeCoffee();

		// �󱭿��� ����
		LargeCoffee largeCoffeeOrdinarySugar = new LargeCoffee(implSugar);
		largeCoffeeOrdinarySugar.makeCoffee();

		// С������ ����
		SmallCoffee smallCoffeeOrdinarySugar = new SmallCoffee(implSugar);
		smallCoffeeOrdinarySugar.makeCoffee();

	}
}
