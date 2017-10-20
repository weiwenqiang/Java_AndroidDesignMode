package four;
/**
 * 使程序运行更高效-原型模式
 */
public class Client {
	public static void main(String[] args) {
		//1.构建文档对象
		WordDocument originDoc = new WordDocument();
		//2.编辑文档，添加图片等
		originDoc.setmText("这是一片文档");
		originDoc.addImage("图片1");
		originDoc.addImage("图片2");
		originDoc.addImage("图片3");
		originDoc.showDocument();
		
		//以原始文档为原型，拷贝一份副本
		WordDocument doc2 = originDoc.clone();
		doc2.showDocument();
		//修改文档副本，不会影响原始文档
		doc2.setmText("这是修改过的Doc2文本");
		doc2.addImage("哈哈.jpg");
		doc2.showDocument();
		
		originDoc.showDocument();
	}
}
