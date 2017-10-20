package eight;

public class TvController implements PowerController {
	TvState mTvState;

	public void setTvState(TvState mTvState) {
		this.mTvState = mTvState;
	}

	public void powerOn() {
		setTvState(new PowerOnState());
		System.out.println("������");
	}

	public void powerOff() {
			setTvState(new PowerOffState());
			System.out.println("�ػ���");
	}

	public void nextChannel() {
		mTvState.nextChannel();
	}

	public void prevChannel() {
		mTvState.prevChannel();
	}

	public void turnUp() {
		mTvState.turnUp();
	}

	public void turnDown() {
		mTvState.turnDown();
	}
}
