package eight;

public class PowerOnState implements TvState {

	@Override
	public void nextChannel() {
		// TODO Auto-generated method stub
		System.out.println("下一频道");
	}

	@Override
	public void prevChannel() {
		// TODO Auto-generated method stub
		System.out.println("上一频道");
	}

	@Override
	public void turnUp() {
		// TODO Auto-generated method stub
		System.out.println("调高音量");
	}

	@Override
	public void turnDown() {
		// TODO Auto-generated method stub
		System.out.println("调低音量");
	}

}
