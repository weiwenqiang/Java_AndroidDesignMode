package thirteen;

/**
 * 负责管理 Memoto
 */
public class Caretaker {
	Memoto mMemoto;// 备忘录

	/**
	 * 存档
	 */
	public void archive(Memoto memoto) {
		this.mMemoto = memoto;
	}

	/**
	 * 获取存档
	 */
	public Memoto getMemoto() {
		return mMemoto;
	}
}
