package seventeen.demo;
/**
 * ÏÔ¿¨Í¬ÊÂ
 */
public class GraphicsCard extends Colleague {

	public GraphicsCard(Mediator mediator) {
		super(mediator);
	}

	public void videoPlay(String data){
		System.out.println("ÊÓÆµ£º"+data);
	}
}
