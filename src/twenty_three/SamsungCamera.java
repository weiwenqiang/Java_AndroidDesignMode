package twenty_three;

public class SamsungCamera implements Camera {

	@Override
	public void open() {
		System.out.println("�����");
	}

	@Override
	public void takePicture() {
		System.out.println("����");
	}

	@Override
	public void close() {
		System.out.println("�ر����");
	}

}