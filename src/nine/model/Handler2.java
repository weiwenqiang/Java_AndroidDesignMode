package nine.model;

public class Handler2 extends AbstractHandler {

	@Override
	protected int getHandleLevel() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	protected void handle(AbstractRequest request) {
		System.out.println("Handler2 handle request:"+request.getRequestLevel());
	}

}
