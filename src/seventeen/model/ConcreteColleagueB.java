package seventeen.model;

public class ConcreteColleagueB extends Colleague {

	public ConcreteColleagueB(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void action() {
		System.out.println("ColleagueB ����Ϣ�ݽ����н��ߴ���");
	}

}
