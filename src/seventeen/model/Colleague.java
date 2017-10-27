package seventeen.model;

public abstract class Colleague {
	protected Mediator mediator;//�н��߶���

	public Colleague(Mediator mediator) {
		super();
		this.mediator = mediator;
	}
	
	public abstract void action();
}
