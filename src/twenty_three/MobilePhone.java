package twenty_three;

public class MobilePhone {
	private Phone mPhone = new PhoneImpl();
	private Camera mCamera = new SamsungCamera();

	public void dail() {
		mPhone.dail();
	}

	public void videoChat() {
		System.out.println("--> ��Ƶ�����ͨ��");
		mCamera.open();
		mPhone.dail();
	}

	public void hangup() {
		mPhone.hangup();
	}

	public void takePicture() {
		mCamera.open();
		mCamera.takePicture();
	}

	public void closeCamera() {
		mCamera.close();
	}
}