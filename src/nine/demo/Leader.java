package nine.demo;

public abstract class Leader {
	protected Leader nextHandler;

	/**
	 * 处理报账请求
	 */
	public final void handleRequest(int money) {
		if (money <= limit()) {
			handle(money);
		} else {
			if (null != nextHandler)
				nextHandler.handleRequest(money);
		}
	}

	public abstract int limit();

	public abstract void handle(int money);
}
