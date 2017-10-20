package four;

import java.util.ArrayList;

public class WordDocument implements Cloneable {
	private String mText;
	
	private ArrayList<String> mImages = new ArrayList<String>();
	
	public WordDocument(){
		System.out.println("------------- WordDocument 构造函数 -------------");
	}

	@Override
	protected WordDocument clone(){
		// TODO Auto-generated method stub
		try{
			WordDocument doc = (WordDocument)super.clone();
			doc.mText = this.mText;
			//对mImages 对象也调用clone函数，进行深拷贝
			doc.mImages = (ArrayList<String>)this.mImages.clone();
			return doc;
		}catch(Exception e){
			
		}
		return null;
	}

	public String getmText() {
		return mText;
	}

	public void setmText(String mText) {
		this.mText = mText;
	}

	public ArrayList<String> getmImages() {
		return mImages;
	}

	public void addImage(String img) {
		this.mImages.add(img);
	}
	/**
	 * 打印文档内容
	 */
	public void showDocument(){
		System.out.println("------------- Word Content Start -------------");
		System.out.println("Text : "+ mText);
		System.out.println("Images List :");
		for(String imgName : mImages){
			System.out.println("image name : "+ imgName);
		}
		System.out.println("------------- Word Content End -------------");
	}
}
