package twelve;

public class Test {
	public static void main(String[] args) {
		//���۲�Ľ�ɫ
		DevTechFrontier devTechFrontier = new DevTechFrontier();
		
		//�۲���
		Coder mrsimple = new Coder("mr.simple");
		Coder coder1 = new Coder("coder-1");
		Coder coder2 = new Coder("coder-2");
		Coder coder3 = new Coder("coder-3");
		
		//���۲���ע�ᵽ�ɹ۲����Ĺ۲����б���
		devTechFrontier.addObserver(mrsimple);
		devTechFrontier.addObserver(coder1);
		devTechFrontier.addObserver(coder2);
		devTechFrontier.addObserver(coder3);
		
		devTechFrontier.postNewPublication("�µ�һ�ڿ�������ǰ���ܱ�������");
	}
}
