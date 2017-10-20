package nineteen;

public class Client {
	public static void main(String[] args) {
		//����һ�����ڵ�
		Composite root = new Composite("Root");
		//��������֦�ɽڵ�
		Composite branch1 = new Composite("Branch1");
		Composite branch2 = new Composite("Branch2");
		//��������Ҷ�ӽڵ�
		Leaf leaf1 = new Leaf("Leaf1");
		Leaf leaf2 = new Leaf("Leaf2");
		//��Ҷ�ӽڵ������֦�ɽڵ���
		branch1.addChild(leaf1);
		branch2.addChild(leaf2);
		//��֦�ɽڵ���������ڵ���
		root.addChild(branch1);
		root.addChild(branch2);
		//ִ�з���
		root.doSomething();
	}
}
