package three;
//������չ�����Ŀ-Builderģʽ
public class Test {
	public static void main(String[] args) {
		//������
		Builder builder = new MacbookBuilder();
		
		Director pcDirector = new Director(builder);
		//��װ��������
		pcDirector.construct("Ӣ�ض�����", "Retina��ʾ��");
		//�������������������Ϣ
		System.out.println("Computer Info : " + builder.create().toString());
		
	}
}
