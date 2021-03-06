package six.demo;
/**
 * 抽象工厂模式
 */
public class Client {
	public static void main(String[] args) {
		CarFactory factoryQ3 = new Q3Factory();
		factoryQ3.createTire().tire();
		factoryQ3.createEngine().engine();
		factoryQ3.createBrake().brake();
		
		System.out.println("-------------------------");
		
		CarFactory factoryQ7 = new Q7Factory();
		factoryQ7.createTire().tire();
		factoryQ7.createEngine().engine();
		factoryQ7.createBrake().brake();
	}
}
