package three;

public class MacbookBuilder extends Builder {
	private Computer mComputer = new Macbook();

	@Override
	public void buildBoard(String board) {
		// TODO Auto-generated method stub
		mComputer.setBoard(board);
	}

	@Override
	public void buildDisplay(String display) {
		// TODO Auto-generated method stub
		mComputer.setDisplay(display);
	}

	@Override
	public void buildOS() {
		// TODO Auto-generated method stub
		mComputer.setOS();
	}

	@Override
	public Computer create() {
		// TODO Auto-generated method stub
		return mComputer;
	}

}
