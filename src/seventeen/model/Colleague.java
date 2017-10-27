package seventeen.model;

public abstract class Colleague {
	protected Mediator mediator;//中介者对象

	public Colleague(Mediator mediator) {
		super();
		this.mediator = mediator;
	}
	
	public abstract void action();
}
