package thirteen;

/**
 * ������� Memoto
 */
public class Caretaker {
	Memoto mMemoto;// ����¼

	/**
	 * �浵
	 */
	public void archive(Memoto memoto) {
		this.mMemoto = memoto;
	}

	/**
	 * ��ȡ�浵
	 */
	public Memoto getMemoto() {
		return mMemoto;
	}
}
