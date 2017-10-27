package thirteen;

public class CallOfDuty {
	private int mCheckpoint = 1;
	private int mLifeValue = 100;
	private String mWeapon = "ɳĮ֮ӥ";

	// ����Ϸ
	public void play() {
		System.out.println("����Ϸ��" + String.format("��%d��", mCheckpoint)
				+ " ��սɱ����");
		mLifeValue -= 10;
		System.out.println("����������");
		mCheckpoint++;
		System.out.println("���� " + String.format("��%d��", mCheckpoint));
	}

	// �˳���Ϸ
	public void quit() {
		System.out.println("-------------------");
		System.out.println("�˳�ǰ����Ϸ���ԣ�" + this.toString());
		System.out.println("�˳���Ϸ");
		System.out.println("-------------------");
	}

	// ��������¼
	public Memoto createMemoto() {
		Memoto memoto = new Memoto();
		memoto.mCheckpoint = mCheckpoint;
		memoto.mLifeValue = mLifeValue;
		memoto.mWeapon = mWeapon;
		return memoto;
	}

	// �ָ���Ϸ
	public void restore(Memoto memoto) {
		this.mCheckpoint = memoto.mCheckpoint;
		this.mLifeValue = memoto.mLifeValue;
		this.mWeapon = memoto.mWeapon;
		System.out.println("�ָ������Ϸ���ԣ�" + this.toString());
	}

	public int getmCheckpoint() {
		return mCheckpoint;
	}

	public void setmCheckpoint(int mCheckpoint) {
		this.mCheckpoint = mCheckpoint;
	}

	public int getmLifeValue() {
		return mLifeValue;
	}

	public void setmLifeValue(int mLifeValue) {
		this.mLifeValue = mLifeValue;
	}

	public String getmWeapon() {
		return mWeapon;
	}

	public void setmWeapon(String mWeapon) {
		this.mWeapon = mWeapon;
	}

	@Override
	public String toString() {
		return "CallOfDuty [mCheckpoint=" + mCheckpoint + ", mLifeValue="
				+ mLifeValue + ", mWeapon=" + mWeapon + "]";
	}

}
