package four;
/**
 * ʹ�������и���Ч-ԭ��ģʽ
 */
public class Client {
	public static void main(String[] args) {
		//1.�����ĵ�����
		WordDocument originDoc = new WordDocument();
		//2.�༭�ĵ������ͼƬ��
		originDoc.setmText("����һƬ�ĵ�");
		originDoc.addImage("ͼƬ1");
		originDoc.addImage("ͼƬ2");
		originDoc.addImage("ͼƬ3");
		originDoc.showDocument();
		
		//��ԭʼ�ĵ�Ϊԭ�ͣ�����һ�ݸ���
		WordDocument doc2 = originDoc.clone();
		doc2.showDocument();
		//�޸��ĵ�����������Ӱ��ԭʼ�ĵ�
		doc2.setmText("�����޸Ĺ���Doc2�ı�");
		doc2.addImage("����.jpg");
		doc2.showDocument();
		
		originDoc.showDocument();
	}
}
