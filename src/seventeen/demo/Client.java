package seventeen.demo;
/**
 * 设计模式-中介模式
 * @author wwq
 *
 */
public class Client {
	public static void main(String[] args) {
		//构造主板对象
		MainBoard mediator = new MainBoard();
		
		//分别构造各个零部件
		CDDevice cd = new CDDevice(mediator);
		CPU cpu = new CPU(mediator);
		GraphicsCard vc = new GraphicsCard(mediator);
		SoundCard sc = new SoundCard(mediator);
		
		//将各个零部件安装到主板
		mediator.setCDDevice(cd);
		mediator.setCPU(cpu);
		mediator.setGraphicsCard(vc);
		mediator.setSoundCard(sc);
		
		//完成后就可以放片了
		cd.load();
	}
}
